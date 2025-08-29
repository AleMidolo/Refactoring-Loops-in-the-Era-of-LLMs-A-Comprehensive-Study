for (int i = 0; i < N; i++) {
    Long product = generator.generate();
    assertNotNull(product);
    assertTrue("Not unique: " + product, validator.valid(product));
    assertTrue(product <= N);
    assertTrue(product >= 1);
}