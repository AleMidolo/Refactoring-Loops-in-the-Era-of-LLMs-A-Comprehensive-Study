int lowerCount = IntStream.range(0, n)
    .filter(i -> getRandom().randomDouble() < 0.5)
    .count();