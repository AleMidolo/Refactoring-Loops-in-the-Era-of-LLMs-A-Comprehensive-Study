for (Long id : projectIDs) {
    File projectDir = getProjectDir(id, false);
    if (projectDir == null) {
        logger.error("Missing project directory for project {}", id);
        continue;
    }
    ProjectMetadata metadata = ProjectMetadataUtilities.load(projectDir);
    mergeEmptyUserMetadata(metadata);
    _projectsMetadata.put(id, metadata);
    if (metadata != null) {
        addProjectTags(metadata.getTags());
    }
}