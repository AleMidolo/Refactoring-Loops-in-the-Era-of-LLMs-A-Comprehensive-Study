myStrippedBytecode.getFilesAndHashes().stream()
    .forEach(path -> {
        Path outputFile = context.outputPath().resolve(path.getSourcePath());
        try {
            Files.createDirectories(outputFile.getParent());
            Files.copy(path.getAbsolutePath(), outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    });