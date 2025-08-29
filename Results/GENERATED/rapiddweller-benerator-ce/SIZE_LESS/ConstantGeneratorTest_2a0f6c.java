IntStream.range(0, 100)
    .forEach(i -> assertEquals("Alice", GeneratorUtil.generateNonNull(generator)));