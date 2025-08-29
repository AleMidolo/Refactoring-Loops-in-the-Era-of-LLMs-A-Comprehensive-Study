IntStream.range(0, 100)
    .mapToObj(i -> generator.generate())
    .peek(name -> {
        if (logger.isDebugEnabled()) {
            logger.debug(name.toString());
        }
    })
    .peek(Assert::assertNotNull)
    .peek(name -> assertTrue(name.toString().length() > 1))
    .forEach(System.out::println);