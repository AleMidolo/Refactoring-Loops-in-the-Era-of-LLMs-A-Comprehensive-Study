js.stream()
  .flatMap(jsInput -> jsInput.getFilesAndHashes().stream())
  .map(path -> {
    CompilerInput input = new CompilerInput(
      SourceFile.builder()
        .withPath(context.outputPath().resolve(Closure.SOURCES_DIRECTORY_NAME).resolve(path.getSourcePath()))
        .withOriginalPath(path.getSourcePath().toString())
        .build()
    );
    input.setCompiler(jsCompiler);
    return new DependencyInfoAndSource(input, input::getCode);
  })
  .forEach(dependencyInfos::add);