IntStream.range(0, n)
    .mapToObj(i -> gen.generate(new ProductWrapper<>()).unwrap())
    .filter(Objects::nonNull)
    .peek(title -> titleUsedCount++)
    .forEach(title -> assertTrue(GERMAN_TITLES.contains(title));