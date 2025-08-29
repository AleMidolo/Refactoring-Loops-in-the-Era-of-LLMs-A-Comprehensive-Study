IntStream.range(0, 10)
    .mapToObj(i -> generator.generateForDataset("DE"))
    .peek(Objects::requireNonNull)
    .forEach(person -> logger.debug(person.toString()));