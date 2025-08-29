jsSources.stream()
        .map(Input::getParentPaths)
        .flatMap(Collection::stream)
        .map(p -> p.resolve(Closure.SOURCES_DIRECTORY_NAME))
        .collect(Collectors.toSet()).stream()
        .forEach(dir -> FileUtils.copyDirectory(dir.toFile(), destSourcesDir));