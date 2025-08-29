js.stream()
        .map(Input::getParentPaths)
        .flatMap(Collection::stream)
        .collect(Collectors.toUnmodifiableList())
        .forEach(path -> FileUtils.copyDirectory(path.toFile(), sources));