IntStream.range(0, 5)
    .mapToObj(i -> generator.generate())
    .forEach(id -> assertEquals(32, id.length()));