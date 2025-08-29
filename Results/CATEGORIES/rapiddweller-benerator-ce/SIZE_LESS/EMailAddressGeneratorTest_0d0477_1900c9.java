for (int i = 0; i < 10; i++) {
    String email = generator.generate();
    assertNotNull(email);
    logger.debug(email);
}