inputSources.getFilesAndHashes().stream()
    .map(this::makeFileInfo)
    .forEach(filesToProcess::add);