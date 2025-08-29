for (int n = 0; n < 10; n++) {
    List<Transition> products = GeneratorUtil.allProducts(generator);
    assertEquals(new Transition(null, 1), products.get(0));
    for (int i = 1; i < products.size() - 1; i++) {
        assertEquals(new Transition(1, 1), products.get(i));
    }
    assertEquals(new Transition(1, null), CollectionUtil.lastElement(products));
    generator.reset();
}