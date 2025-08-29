reactorProjects.stream()
    .peek(reactorProject -> getLog().info("Deleting cache for " + reactorProject))
    .forEach(reactorProject -> deleteArtifact(currentPluginCacheDir, reactorProject.getArtifactId()));