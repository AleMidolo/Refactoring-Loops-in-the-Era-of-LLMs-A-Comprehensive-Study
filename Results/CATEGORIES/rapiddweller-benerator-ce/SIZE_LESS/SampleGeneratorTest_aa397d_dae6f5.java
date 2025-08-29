for (int i = 0; i < 100; i++) {
    int product = GeneratorUtil.generateNonNull(generator);
    assertTrue("generated value not in expected value range: " + product, 0 <= product && product <= 99);
}