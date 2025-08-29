boolean allParallelizable = sources.stream()
    .allMatch(source -> source.isParallelizable());