for (String generatedTest : generatedTests) {
    String testFilePathWithoutSuffix = generatedTest.substring(0, generatedTest.length() - 3);
    File testJs = new File(webappDirectory, testFilePathWithoutSuffix + ".testsuite");
    Path tmp = Files.createTempDirectory(testJs.getName() + "-dir");
    Path copy = tmp.resolve(testFilePathWithoutSuffix + ".js");
    Files.createDirectories(copy.getParent());
    Files.copy(testJs.toPath(), copy);
    String testClass = testFilePathWithoutSuffix.replaceAll("/", ".");
    Project suite = new Project(test.getKey() + "-" + generatedTest);
    suite.setSourceRoots(Collections.singletonList(tmp.toString()));
    ArrayList<com.vertispan.j2cl.build.task.Dependency> dependencies = new ArrayList<>(test.getDependencies());
    Dependency testDep = new Dependency();
    testDep.setProject(test);
    testDep.setScope(com.vertispan.j2cl.build.task.Dependency.Scope.BOTH);
    dependencies.add(testDep);
    suite.setDependencies(dependencies);
    String testScriptFilename = initialScriptFilename.substring(0, initialScriptFilename.lastIndexOf(".js")) + "-" + testClass + ".js";
    PropertyTrackingConfig.ConfigValueProvider overridenConfig = new OverrideConfigValueProvider(config, Collections.singletonMap("initialScriptFilename", testScriptFilename));
    buildService = new BuildService(taskRegistry, taskScheduler, diskCache);
    buildService.assignProject(suite, outputTask, overridenConfig);
    buildService.initialHashes();
    BlockingBuildListener l = new BlockingBuildListener();
    try {
        buildService.requestBuild(l);
        l.blockUntilFinished();
    } catch (InterruptedException e) {
        throw new MojoExecutionException("Interrupted", e);
    } catch (CompletionException e) {
        throw new MojoExecutionException("Error while building", e.getCause());
    }
    if (!l.isSuccess()) {
        throw new MojoFailureException("Error building test, see log for details");
    }
    if (skipTests) {
        continue;
    }
    getLog().info("Test started: " + testClass);
    Path startupHtmlFile;
    try {
        Path webappDirPath = Paths.get(webappDirectory);
        Path outputJsPath = webappDirPath.resolve(testScriptFilename);
        File outputJs = new File(new File(webappDirectory), testScriptFilename);
        Path junitStartupPath = outputJsPath.resolveSibling(outputJsPath.getFileName().toString().substring(0, outputJs.getName().length() - 2) + "html");
        Files.createDirectories(junitStartupPath.getParent());
        String fileContents = CharStreams.toString(new InputStreamReader(TestMojo.class.getResourceAsStream("/junit.html")));
        fileContents = fileContents.replace("<TEST_SCRIPT>", outputJs.getName());
        Files.write(junitStartupPath, fileContents.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        startupHtmlFile = webappDirPath.relativize(junitStartupPath);
    } catch (IOException ex) {
        throw new UncheckedIOException(ex);
    }
    Server server = new Server(0);
    ResourceHandler resourceHandler = new ResourceHandler();
    resourceHandler.setDirectoriesListed(true);
    resourceHandler.setBaseResource(Resource.newResource(webappDirectory));
    server.setHandler(resourceHandler);
    server.start();
    WebDriver driver = createBrowser();
    if (!server.isStarted()) {
        CountDownLatch started = new CountDownLatch(1);
        server.addLifeCycleListener(new AbstractLifeCycle.AbstractLifeCycleListener() {

            @Override
            public void lifeCycleStarted(LifeCycle event) {
                started.countDown();
            }
        });
        started.await();
    }
    int port = ((ServerConnector) server.getConnectors()[0]).getLocalPort();
    try {
        String path = startupHtmlFile.toString().replaceAll(Pattern.quote(File.separator), "/");
        String url = "http://localhost:" + port + "/" + path;
        getLog().info("fetching " + url);
        driver.get(url);
        new FluentWait<>(driver).withTimeout(Duration.ofMinutes(1)).withMessage("Tests failed to finish before timeout").pollingEvery(Duration.ofMillis(100)).until(d -> isFinished(d));
        if (!isSuccess(driver)) {
            this.analyzeLog(driver);
            failedTests.put(testClass, generatedTest);
            getLog().error("Test failed!");
        } else {
            getLog().info("Test passed!");
        }
    } catch (Exception ex) {
        failedTests.put(testClass, generatedTest);
        this.analyzeLog(driver);
        getLog().error("Test failed!");
        getLog().error(cleanForMavenLog(ex.getMessage()));
    } finally {
        driver.quit();
    }
}