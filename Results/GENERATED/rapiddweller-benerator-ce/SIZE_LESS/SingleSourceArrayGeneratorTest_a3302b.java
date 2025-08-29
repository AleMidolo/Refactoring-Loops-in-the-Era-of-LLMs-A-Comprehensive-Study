IntStream.range(0, 100)
    .mapToObj(i -> GeneratorUtil.generateNonNull(generator))
    .forEach(product -> {
        assertTrue(minLength <= product.length);
        assertTrue(product.length <= maxLength);
    });