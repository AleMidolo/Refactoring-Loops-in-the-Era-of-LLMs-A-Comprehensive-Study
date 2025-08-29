IntStream.range(0, 100)
    .forEach(i -> assertEquals(1000 + i, generator.generate().intValue()));