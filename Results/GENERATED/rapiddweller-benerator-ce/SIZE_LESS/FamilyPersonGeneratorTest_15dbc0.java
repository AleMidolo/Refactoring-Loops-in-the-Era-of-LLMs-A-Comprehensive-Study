IntStream.range(0, 10)
    .mapToObj(i -> generator.generate())
    .peek(Assertions::assertNotNull)
    .forEach(familyPerson -> logger.debug("familyPerson: {}", familyPerson));