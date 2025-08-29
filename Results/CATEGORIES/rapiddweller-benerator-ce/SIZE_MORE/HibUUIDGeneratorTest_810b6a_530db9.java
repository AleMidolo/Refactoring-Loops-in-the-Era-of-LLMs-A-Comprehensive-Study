for (int i = 0; i < 5; i++) {
    String id = generator.generate();
    assertEquals(36, id.length());
    assertEquals('-', id.charAt(8));
    assertEquals('-', id.charAt(17));
    assertEquals('-', id.charAt(22));
    assertEquals('-', id.charAt(31));
    logger.debug(id);
}