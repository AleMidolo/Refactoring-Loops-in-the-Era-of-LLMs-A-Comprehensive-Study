IntStream.range(0, 100_000)
    .mapToObj(i -> generator.generate())
    .forEach(result::add);