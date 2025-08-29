IntStream.range(0, 10)
    .forEach(n -> {
        List<Transition> products = GeneratorUtil.allProducts(generator);
        assertEquals(new Transition(null, 1), products.get(0));
        IntStream.range(1, products.size() - 1)
            .forEach(i -> assertEquals(new Transition(1, 1), products.get(i)));
        assertEquals(new Transition(1, null), CollectionUtil.lastElement(products));
        generator.reset();
    });