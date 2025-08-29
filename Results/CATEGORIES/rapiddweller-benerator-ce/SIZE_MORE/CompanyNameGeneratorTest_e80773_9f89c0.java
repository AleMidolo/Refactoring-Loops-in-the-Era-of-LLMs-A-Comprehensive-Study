for (int i = 0; i < 100; i++) {
    CompanyName name = generator.generate();
    if (logger.isDebugEnabled()) {
        logger.debug(name.toString());
    }
    assertNotNull(name);
    assertTrue(name.toString().length() > 1);
}