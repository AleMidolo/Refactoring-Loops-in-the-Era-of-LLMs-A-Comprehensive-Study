IntStream.range(0, 10)
    .forEach(i -> {
        String product = generator.generate();
        assertNotNull(product);
});