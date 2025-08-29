for (int n = 0; n < 10; n++) {
    List<Integer> products = GeneratorUtil.allProducts(generator);
    assertEquals(0, products.size() % 2);
    for (int i = 0; i < products.size(); i++) {
        assertEquals((1 + (i % 2)), products.get(i).intValue());
    }
    generator.reset();
}