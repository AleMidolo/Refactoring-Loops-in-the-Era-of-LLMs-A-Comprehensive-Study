for (int i = 0; i < 100; i++) {
    String product = generator.generate();
    logger.debug(product);
    assertNotNull(product);
}