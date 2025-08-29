records.stream()
        .takeWhile(record -> !allModified && Instant.now().isBefore(quicksaveDeadline))
        .forEach(record -> {
            try {
                saveProject(record.project);
            } catch (Exception e) {
                logger.error("Error when saving projects. Attempting to free memory", e);
                disposeUnmodifiedProjects();
            }
        });