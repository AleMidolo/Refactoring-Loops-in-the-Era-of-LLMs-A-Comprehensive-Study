records.stream()
        .filter(record -> !(allModified || Instant.now().isAfter(quicksaveDeadline)))
        .forEach(record -> {
            try {
                saveProject(record.project);
            } catch (Exception e) {
                logger.error("Error when saving projects. Attempting to free memory", e);
                disposeUnmodifiedProjects();
            }
        });