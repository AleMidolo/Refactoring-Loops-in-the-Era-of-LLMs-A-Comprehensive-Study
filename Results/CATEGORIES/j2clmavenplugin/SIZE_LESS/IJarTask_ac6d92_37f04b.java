for (CachedPath path : myStrippedBytecode.getFilesAndHashes()) {
    Path outputFile = context.outputPath().resolve(path.getSourcePath());
    Files.createDirectories(outputFile.getParent());
    Files.copy(path.getAbsolutePath(), outputFile);
}