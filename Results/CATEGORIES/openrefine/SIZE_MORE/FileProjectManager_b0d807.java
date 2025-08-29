for (Long id : modified) {
    ProjectMetadata metadata = _projectsMetadata.get(id);
    if (metadata != null) {
        ProjectMetadataUtilities.save(metadata, getProjectDir(id));
    } else {
        logger.error("Missing metadata on save for project ID {}", id);
    }
}