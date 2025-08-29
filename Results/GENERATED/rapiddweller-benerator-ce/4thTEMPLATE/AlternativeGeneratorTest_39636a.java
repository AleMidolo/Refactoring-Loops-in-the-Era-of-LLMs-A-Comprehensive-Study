IntStream.range(0, 100)
    .forEach(i -> {
        int product = GeneratorUtil.generateNonNull(generator);
        assertTrue((-2 <= product && product <= -1) || (1 <= product && product <= 2));
    });