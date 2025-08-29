files.stream()
        .filter(Objects::nonNull)
        .filter(File::isDirectory)
        .filter(file -> !file.isHidden())
        .filter(file -> file.getName().endsWith(PROJECT_DIR_SUFFIX))
        .forEach(file -> {
            String dirName = file.getName();
            String idString = dirName.substring(0, dirName.length() - PROJECT_DIR_SUFFIX.length());
            long id = -1;
            try {
                id = Long.parseLong(idString);
            } catch (NumberFormatException e) {
            }
            if (id > 0 && !_projectsMetadata.containsKey(id)) {
                if (loadProjectMetadata(id)) {
                    logger.info("Recovered project named {} in directory {}", getProjectMetadata(id).getName(), dirName);
                    recovered = true;
                } else {
                    logger.warn("Failed to recover project in directory {}", dirName);
                    file.renameTo(new File(file.getParentFile(), dirName + ".corrupted"));
                }
            }
        });