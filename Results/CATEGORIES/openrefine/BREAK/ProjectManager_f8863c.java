for (SaveRecord record : records) {
    if (!allModified && Instant.now().isAfter(quicksaveDeadline)) {
        break;
    }
    try {
        saveProject(record.project);
    } catch (Exception e) {
        logger.error("Error when saving projects. Attempting to free memory", e);
        disposeUnmodifiedProjects();
    }
}