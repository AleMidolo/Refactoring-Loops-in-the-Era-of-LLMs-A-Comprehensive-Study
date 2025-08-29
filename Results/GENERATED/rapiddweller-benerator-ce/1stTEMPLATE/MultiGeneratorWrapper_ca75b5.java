sources.stream()
    .filter(source -> !source.isParallelizable())
    .findFirst()
    .ifPresent(source -> false);