existingUnpackedBytecode.getFilesAndHashes().stream()
    .map(entry -> context.outputPath().resolve(entry.getSourcePath()))
    .peek(outputFile -> Files.createDirectories(outputFile.getParent()))
    .forEach(outputFile -> Files.copy(entry.getAbsolutePath(), outputFile));