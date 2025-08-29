IntStream.range(0, 10)
    .mapToObj(i -> generator.generate())
    .peek(Assertions::assertNotNull)
    .map(Person::toString)
    .forEach(logger::debug);