IntStream.range(0, 100)
         .mapToObj(i -> generator.generate())
         .peek(logger::debug)
         .forEach(Assert::assertNotNull);