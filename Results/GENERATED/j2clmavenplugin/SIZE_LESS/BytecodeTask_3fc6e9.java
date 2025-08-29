resources.getFilesAndHashes().stream()
    .forEach(entry -> {
        try {
            Files.createDirectories(context.outputPath().resolve(entry.getSourcePath()).getParent());
            Files.copy(entry.getAbsolutePath(), context.outputPath().resolve(entry.getSourcePath()));
        } catch (IOException e) {
            // Handle exception if needed
        }
    });