for (Map.Entry<Path, Project> entry : pathToProjects.entrySet()) {
    Project project = entry.getValue();
    Path rootPath = entry.getKey();
    Map<Path, DiskCache.CacheEntry> projectFiles = directoryWatcher.pathHashes().entrySet().stream().filter(e -> e.getValue() != FileHash.DIRECTORY).filter(e -> e.getKey().startsWith(rootPath)).map(e -> new DiskCache.CacheEntry(rootPath.relativize(e.getKey()), rootPath, e.getValue())).collect(Collectors.toMap(e -> e.getSourcePath(), Function.identity()));
    buildService.triggerChanges(project, projectFiles, Collections.emptyMap(), Collections.emptySet());
}