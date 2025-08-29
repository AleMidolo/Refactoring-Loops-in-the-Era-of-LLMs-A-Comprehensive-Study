modified.stream()
        .map(id -> _projectsMetadata.get(id))
        .filter(Objects::nonNull)
        .forEach(metadata -> ProjectMetadataUtilities.save(metadata, getProjectDir(metadata.getProjectId()));
        .orElseGet(() -> logger.error("Missing metadata on save for project ID {}", metadata.getProjectId()));