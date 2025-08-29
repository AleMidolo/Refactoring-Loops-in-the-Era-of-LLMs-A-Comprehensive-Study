IntStream.range(0, N)
    .mapToObj(i -> generator.generate())
    .forEach(product -> {
        assertNotNull(product);
        assertTrue("Not unique: " + product, validator.valid(product));
        assertTrue(product <= N);
        assertTrue(product >= 1);
    });