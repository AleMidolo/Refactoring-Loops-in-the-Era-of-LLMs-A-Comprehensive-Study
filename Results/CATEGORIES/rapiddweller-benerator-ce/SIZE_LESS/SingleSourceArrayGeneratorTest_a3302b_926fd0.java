for (int i = 0; i < 100; i++) {
    String[] product = GeneratorUtil.generateNonNull(generator);
    assertTrue(minLength <= product.length);
    assertTrue(product.length <= maxLength);
}