for (CachedPath entry : existingUnpackedBytecode.getFilesAndHashes()) {
    Path outputFile = context.outputPath().resolve(entry.getSourcePath());
    Files.createDirectories(outputFile.getParent());
    Files.copy(entry.getAbsolutePath(), outputFile);
}