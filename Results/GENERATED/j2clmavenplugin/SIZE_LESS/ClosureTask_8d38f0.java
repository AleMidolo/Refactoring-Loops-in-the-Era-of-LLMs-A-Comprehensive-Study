outputToCopy.forEach(input ->
    input.getFilesAndHashes().forEach(entry ->
        copiedOutputPath(resourceOutputPath, entry)
    )
);