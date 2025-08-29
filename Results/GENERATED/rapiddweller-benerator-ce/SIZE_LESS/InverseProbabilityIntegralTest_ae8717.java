IntStream.iterate(1, i -> i <= 4, i -> i + 0.5)
    .forEach(d -> assertEquals(1. / 7, counts.get(d).doubleValue() / n, 0.05));