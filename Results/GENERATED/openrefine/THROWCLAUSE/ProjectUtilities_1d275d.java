Arrays.asList(DATA_ZIP, DATA_TEMP_ZIP, DATA_OLD_ZIP)
    .stream()
    .map(filename -> new File(dir, filename))
    .filter(File::exists)
    .findFirst()
    .map(file -> loadFromFile(file, id))
    .orElse(null);