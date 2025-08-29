for (Input jsInput : js) {
    for (CachedPath path : jsInput.getFilesAndHashes()) {
        CompilerInput input = new CompilerInput(SourceFile.builder().withPath(context.outputPath().resolve(Closure.SOURCES_DIRECTORY_NAME).resolve(path.getSourcePath())).withOriginalPath(path.getSourcePath().toString()).build());
        input.setCompiler(jsCompiler);
        dependencyInfos.add(new DependencyInfoAndSource(input, input::getCode));
    }
}