for (Path path : jsSources.stream().map(Input::getParentPaths).flatMap(Collection::stream).collect(Collectors.toUnmodifiableList())) {
    FileUtils.copyDirectory(path.toFile(), sources);
}