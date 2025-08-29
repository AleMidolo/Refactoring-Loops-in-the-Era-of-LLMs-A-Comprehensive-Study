IntStream.range(0, 10).forEach(i -> {
    String tld = generator.generate();
    assertNotNull(tld);
});