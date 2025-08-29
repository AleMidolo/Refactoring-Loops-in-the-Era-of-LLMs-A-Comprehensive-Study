IntStream.range(0, 10)
    .forEach(n -> {
        List<Integer> products = GeneratorUtil.allProducts(generator);
        assertEquals(0, products.size() % 2);
        IntStream.range(0, products.size())
            .forEach(i -> {
                assertEquals((1 + (i % 2)), products.get(i).intValue());
            });
        generator.reset();
    });