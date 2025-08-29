Arrays.stream(new String[] { ProjectMetadata.DEFAULT_FILE_NAME, ProjectMetadata.TEMP_FILE_NAME, ProjectMetadata.OLD_FILE_NAME })
    .map(filename -> new File(projectDir, filename))
    .map(file -> {
        try {
            return loadFromFile(file);
        } catch (IOException e) {
            logger.warn("load metadata failed: {}", file.getAbsolutePath(), e);
            return null;
        }
    })
    .filter(Objects::nonNull)
    .findFirst()
    .orElse(null);