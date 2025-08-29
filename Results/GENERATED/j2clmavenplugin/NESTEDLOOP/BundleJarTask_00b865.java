outputToCopy.forEach(input ->
    input.getFilesAndHashes().forEach(entry -> copiedOutputPath(outputDir.toPath(), entry))
);