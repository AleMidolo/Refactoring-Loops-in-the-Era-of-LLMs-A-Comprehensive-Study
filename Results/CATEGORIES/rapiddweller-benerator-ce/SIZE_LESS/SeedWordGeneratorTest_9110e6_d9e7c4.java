for (int i = 0; i < 10; i++) {
    String word = generator.generate();
    assertNotNull(word);
    logger.debug(word);
    assertNotNull(word);
    assertTrue(word.length() > 0);
}