IntStream.range(0, 10)
    .mapToObj(i -> generator.generate())
    .peek(Objects::requireNonNull)
    .forEach(familyPerson -> logger.debug(familyPerson.toString()));