for (int n = 0; n < 10; n++) {
    List<Integer> products = GeneratorUtil.allProducts(generator);
    for (Integer product : products) {
        assertEquals(1, product.intValue());
    }
    generator.reset();
}