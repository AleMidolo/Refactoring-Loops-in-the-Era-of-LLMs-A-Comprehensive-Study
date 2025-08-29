IntStream.range(0, 10)
    .forEach(n -> {
        List<String> products = GeneratorUtil.allProducts(generator);
        assertEquals(0, products.size() % 2);
        IntStream.range(0, products.size())
            .forEach(i -> {
                Object p = products.get(i);
                assertEquals((1 + (i % 2)), p);
            });
        generator.reset();
    });