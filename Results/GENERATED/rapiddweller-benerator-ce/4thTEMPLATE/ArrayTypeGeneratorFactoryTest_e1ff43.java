IntStream.range(0, 4)
    .forEach(i -> {
        Object[] product = GeneratorUtil.generateNonNull(generator);
        assertTrue(Arrays.equals(INT13, product) || Arrays.equals(INT14, product) || Arrays.equals(INT23, product) || Arrays.equals(INT24, product));
    });