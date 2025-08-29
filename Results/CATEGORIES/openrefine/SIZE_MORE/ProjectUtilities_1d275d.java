for (String filename : new String[] { DATA_ZIP, DATA_TEMP_ZIP, DATA_OLD_ZIP }) {
    try {
        File file = new File(dir, filename);
        if (file.exists()) {
            return loadFromFile(file, id);
        }
    } catch (IOException e) {
        logger.warn("Failed to load from data file {} / {}", dir, filename, e);
    }
}