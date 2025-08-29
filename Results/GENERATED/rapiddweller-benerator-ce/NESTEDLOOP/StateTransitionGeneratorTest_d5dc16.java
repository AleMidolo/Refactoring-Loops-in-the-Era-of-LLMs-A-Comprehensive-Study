IntStream.range(0, 10).forEach(n -> {
    List<Transition> products = GeneratorUtil.allProducts(generator);
    assertEquals("Expected an odd number of products, but found: " + products.size(), 1, products.size() % 2);
    assertEquals(new Transition(null, 1), products.get(0));
    IntStream.range(1, products.size() - 1).forEach(i -> {
        int oldState = 1 + ((i - 1) % 2);
        int newState = 1 + (i % 2);
        assertEquals(new Transition(oldState, newState), products.get(i));
    });
    assertEquals(new Transition(2, null), CollectionUtil.lastElement(products));
    generator.reset();
});