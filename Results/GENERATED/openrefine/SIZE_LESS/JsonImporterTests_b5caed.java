IntStream.range(1, 6)
    .mapToObj(this::getTypicalElement)
    .collect(Collectors.joining(","));