for (String goal : execution.getGoals()) {
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
}