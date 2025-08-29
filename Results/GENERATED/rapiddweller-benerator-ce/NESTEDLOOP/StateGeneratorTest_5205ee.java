IntStream.range(0, 10)
    .forEach(n -> {
        List<Integer> products = GeneratorUtil.allProducts(generator);
        products.forEach(product -> assertEquals(1, product.intValue()));
        generator.reset();
    });