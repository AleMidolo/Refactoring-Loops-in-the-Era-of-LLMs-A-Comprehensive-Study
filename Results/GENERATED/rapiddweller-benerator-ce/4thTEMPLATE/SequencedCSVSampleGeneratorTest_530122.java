IntStream.range(0, 1000)
    .mapToObj(i -> GeneratorUtil.generateNonNull(generator))
    .forEach(product -> assertTrue("generated value not in expected value range: " + product, 0 <= product && product <= 99));