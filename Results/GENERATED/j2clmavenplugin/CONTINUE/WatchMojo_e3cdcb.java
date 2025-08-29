reactorProjects.stream()
    .filter(rp -> !rp.getPackaging().equals("pom"))
    .map(rp -> rp.getPlugin(pluginDescriptor.getPlugin().getKey()))
    .filter(Objects::nonNull)
    .forEach(plugin -> {
        Xpp3Dom pluginConfiguration = (Xpp3Dom) plugin.getConfiguration();
        List<PluginExecution> executions = plugin.getExecutions();
        executions.forEach(execution -> {
            Xpp3Dom executionConfig = (Xpp3Dom) execution.getConfiguration();
            String initialScriptFilename = reactorProject.getArtifactId() + "/" + reactorProject.getArtifactId() + ".js";
            Xpp3Dom watchGoalConfig = new Xpp3Dom(mojoExecution.getConfiguration());
            if (watchGoalConfig.getChild("initialScriptFilename") != null) {
                watchGoalConfig.getChild("initialScriptFilename").setValue(initialScriptFilename);
            } else {
                Xpp3Dom child = new Xpp3Dom("initialScriptFilename");
                child.setValue(initialScriptFilename);
                watchGoalConfig.addChild(child);
            }
            if (watchGoalConfig.getChild("webappDirectory") == null || watchGoalConfig.getChild("webappDirectory").getValue() == null) {
                Xpp3Dom child = new Xpp3Dom("webappDirectory");
                child.setValue(webappDirectory);
                watchGoalConfig.addChild(child);
            }
            Xpp3Dom configuration = merge(watchGoalConfig, executionConfig);
            execution.getGoals().forEach(goal -> {
                if (goal.equals("test") && shouldCompileTest()) {
                    getLog().warn("Test watch temporarily disabled");
                } else if (goal.equals("build") && shouldCompileBuild()) {
                    getLog().debug("j2cl:watch found a build execution: " + execution);
                    Xpp3DomConfigValueProvider config = new Xpp3DomConfigValueProvider(configuration, expressionEvaluator, repoSession, repositories, repoSystem, extraClasspath, getLog());
                    Project p = buildProject(reactorProject, reactorProject.getArtifact(), true, projectBuilder, request, pluginVersion, builtProjects, Artifact.SCOPE_COMPILE_PLUS_RUNTIME, getDependencyReplacements(), extraJsZips);
                    String compilationLevel = config.findNode("compilationLevel").readString();
                    String outputTask = getOutputTask(compilationLevel);
                    buildService.assignProject(p, outputTask, config);
                }
            });
        });
    });