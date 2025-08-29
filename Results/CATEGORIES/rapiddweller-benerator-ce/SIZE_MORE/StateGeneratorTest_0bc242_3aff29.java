for (int n = 0; n < 10; n++) {
    List<String> products = GeneratorUtil.allProducts(generator);
    assertEquals(0, products.size() % 2);
    for (int i = 0; i < products.size(); i++) {
        Object p = products.get(i);
        assertEquals((1 + (i % 2)), p);
    }
    generator.reset();
}