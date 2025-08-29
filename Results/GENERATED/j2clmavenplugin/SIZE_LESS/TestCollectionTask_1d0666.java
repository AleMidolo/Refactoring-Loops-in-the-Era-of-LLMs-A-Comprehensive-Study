apt.getFilesAndHashes().forEach(entry -> {
    Path outputFile = context.outputPath().resolve(entry.getSourcePath());
    Files.createDirectories(outputFile.getParent());
    Files.copy(entry.getAbsolutePath(), outputFile);
});