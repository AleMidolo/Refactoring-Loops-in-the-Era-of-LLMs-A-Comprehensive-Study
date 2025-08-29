projectIDs.stream()
        .map(id -> getProjectDir(id, false))
        .filter(Objects::nonNull)
        .map(ProjectMetadataUtilities::load)
        .peek(this::mergeEmptyUserMetadata)
        .forEach(metadata -> {
            _projectsMetadata.put(id, metadata);
            if (metadata != null) {
                addProjectTags(metadata.getTags());
            }
        });