return _projectsMetadata.values().stream()
    .filter(pm -> pm.getName().equals(name))
    .findFirst()
    .orElse(null);