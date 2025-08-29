_projects.values().stream()
    .map(Project::getMetadata)
    .forEach(this::mergeEmptyUserMetadata);