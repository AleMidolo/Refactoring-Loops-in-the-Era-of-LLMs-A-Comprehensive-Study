IntStream.range(0, 10)
    .mapToObj(i -> GeneratorUtil.generateNonNull(helper))
    .forEach(actual -> assertEquals("Invalid product: ", "", actual));