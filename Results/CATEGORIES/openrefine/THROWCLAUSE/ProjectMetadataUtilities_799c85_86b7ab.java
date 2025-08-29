for (String filename : new String[] { ProjectMetadata.DEFAULT_FILE_NAME, ProjectMetadata.TEMP_FILE_NAME, ProjectMetadata.OLD_FILE_NAME }) {
    File file = new File(projectDir, filename);
    try {
        return loadFromFile(file);
    } catch (IOException e) {
        logger.warn("load metadata failed: {}", file.getAbsolutePath(), e);
    }
}