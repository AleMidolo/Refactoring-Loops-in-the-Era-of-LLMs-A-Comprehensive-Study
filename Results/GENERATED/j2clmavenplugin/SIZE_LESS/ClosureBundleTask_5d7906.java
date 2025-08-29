jsInput.getFilesAndHashes().stream()
        .map(path -> new CompilerInput(SourceFile.builder()
                .withPath(context.outputPath().resolve(Closure.SOURCES_DIRECTORY_NAME).resolve(path.getSourcePath()))
                .withOriginalPath(path.getSourcePath().toString())
                .build()))
        .peek(input -> input.setCompiler(jsCompiler))
        .map(input -> new DependencyInfoAndSource(input, input::getCode))
        .forEach(dependencyInfos::add);