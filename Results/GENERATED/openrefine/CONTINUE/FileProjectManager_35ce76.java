projectIDs.stream()
    .map(id -> getProjectDir(id, false))
    .filter(Objects::nonNull)
    .peek(projectDir -> {
        ProjectMetadata metadata = ProjectMetadataUtilities.load(projectDir);
        mergeEmptyUserMetadata(metadata);
        _projectsMetadata.put(projectDir, metadata);
        if (metadata != null) {
            addProjectTags(metadata.getTags());
        }
    })
    .count();