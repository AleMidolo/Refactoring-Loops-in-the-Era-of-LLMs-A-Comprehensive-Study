IntStream.range(0, 10)
    .mapToObj(i -> generator.generate())
    .peek(Assert::assertNotNull)
    .peek(logger::debug)
    .peek(Assert::assertNotNull)
    .anyMatch(word -> word.length() > 0);