for (int i = 0; i < 100; i++) {
    int product = GeneratorUtil.generateNonNull(generator);
    assertTrue((-2 <= product && product <= -1) || (1 <= product && product <= 2));
}