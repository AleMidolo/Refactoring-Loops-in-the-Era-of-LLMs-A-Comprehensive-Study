for (int i = 0; i < 10; i++) {
    Long product = generator.generate();
    assertNotNull(product);
    assertEquals(++n, product.longValue());
}