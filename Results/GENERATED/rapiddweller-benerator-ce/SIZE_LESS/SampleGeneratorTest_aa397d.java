IntStream.range(0, 100)
    .mapToObj(i -> GeneratorUtil.generateNonNull(generator))
    .forEach(product -> assertTrue("generated value not in expected value range: " + product, product >= 0 && product <= 99));