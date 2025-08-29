IntStream.range(0, 100)
    .mapToObj(i -> generator.generate())
    .peek(name -> {
        if (logger.isDebugEnabled()) {
            logger.debug(name.toString());
        }
    })
    .forEach(name -> {
        assertNotNull(name);
        assertTrue(name.toString().length() > 1);
    });