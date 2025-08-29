files.stream()
    .filter(file -> file != null && file.isDirectory() && !file.isHidden())
    .filter(file -> file.getName().endsWith(PROJECT_DIR_SUFFIX))
    .map(file -> {
        String dirName = file.getName();
        String idString = dirName.substring(0, dirName.length() - PROJECT_DIR_SUFFIX.length());
        return new AbstractMap.SimpleEntry<>(file, idString);
    })
    .forEach(entry -> {
        File file = entry.getKey();
        String idString = entry.getValue();
        long id = -1;
        try {
            id = Long.parseLong(idString);
        } catch (NumberFormatException e) {
        }

        if (id > 0 && !_projectsMetadata.containsKey(id)) {
            if (loadProjectMetadata(id)) {
                logger.info("Recovered project named {} in directory {}", getProjectMetadata(id).getName(), file.getName());
                recovered = true;
            } else {
                logger.warn("Failed to recover project in directory {}", file.getName());
                file.renameTo(new File(file.getParentFile(), file.getName() + ".corrupted"));
            }
        }
    });