_projects.values().stream()
    .filter(Objects::nonNull)
    .forEach(Project::dispose);