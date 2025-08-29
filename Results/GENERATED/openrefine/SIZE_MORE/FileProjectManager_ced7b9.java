modified.stream()
    .map(id -> _projectsMetadata.get(id))
    .filter(Objects::nonNull)
    .forEach(metadata -> ProjectMetadataUtilities.save(metadata, getProjectDir(metadata.getId()));
    .orElseGet(() -> {
        logger.error("Missing metadata on save for project ID {}", id);
        return null;
    });