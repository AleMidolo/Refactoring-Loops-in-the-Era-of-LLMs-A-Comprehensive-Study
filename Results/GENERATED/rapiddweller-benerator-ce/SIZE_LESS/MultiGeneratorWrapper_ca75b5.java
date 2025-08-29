sources.stream()
        .filter(source -> !source.isParallelizable())
        .findAny()
        .ifPresent(source -> { return false; });