Arrays.stream(values)
    .forEach(expectedValue -> {
        Long product = generator.generate();
        assertNotNull("Generator is not available: " + generator, product);
        assertEquals(expectedValue, product.longValue());
    });