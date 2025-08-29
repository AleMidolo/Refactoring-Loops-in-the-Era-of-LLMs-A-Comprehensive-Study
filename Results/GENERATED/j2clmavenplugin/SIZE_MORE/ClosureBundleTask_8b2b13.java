js.stream()
    .flatMap(jsInput -> jsInput.getChanges().stream())
    .forEach(change -> {
        if (change.changeType() == ChangedCachedPath.ChangeType.REMOVED) {
            depInfoMap.remove(change.getSourcePath().toString());
        } else {
            CompilerInput input = new CompilerInput(SourceFile.builder().withPath(context.outputPath().resolve(Closure.SOURCES_DIRECTORY_NAME).resolve(change.getSourcePath())).withOriginalPath(change.getSourcePath().toString()).build());
            input.setCompiler(jsCompiler);
            depInfoMap.put(change.getSourcePath().toString(), new DependencyInfoAndSource(input, input::getCode));
        }
    });