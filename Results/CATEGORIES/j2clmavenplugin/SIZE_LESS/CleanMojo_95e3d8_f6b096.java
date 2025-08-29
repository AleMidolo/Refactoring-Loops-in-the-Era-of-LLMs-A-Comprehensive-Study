for (MavenProject reactorProject : reactorProjects) {
    getLog().info("Deleting cache for " + reactorProject);
    deleteArtifact(currentPluginCacheDir, reactorProject.getArtifactId());
}