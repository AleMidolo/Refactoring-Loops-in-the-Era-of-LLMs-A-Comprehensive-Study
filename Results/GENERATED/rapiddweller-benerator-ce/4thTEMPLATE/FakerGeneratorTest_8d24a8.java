IntStream.range(0, 10)
    .forEach(i -> {
        Object tld = generator.generate();
        assertNotNull(tld);
    });