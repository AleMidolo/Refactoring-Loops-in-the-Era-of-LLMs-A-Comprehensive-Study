input.getFilesAndHashes().stream()
    .forEach(entry -> copiedOutputPath(resourceOutputPath, entry));