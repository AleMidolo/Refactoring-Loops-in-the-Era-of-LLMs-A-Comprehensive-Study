for (int n = 0; n < 10; n++) {
    List<Transition> products = GeneratorUtil.allProducts(generator);
    assertEquals("Expected an odd number of products, but found: " + products.size(), 1, products.size() % 2);
    assertEquals(new Transition(null, 1), products.get(0));
    for (int i = 1; i < products.size() - 1; i++) {
        int oldState = 1 + ((i - 1) % 2);
        int newState = 1 + (i % 2);
        assertEquals(new Transition(oldState, newState), products.get(i));
    }
    assertEquals(new Transition(2, null), CollectionUtil.lastElement(products));
    generator.reset();
}