IntStream.range(0, 10)
    .mapToObj(i -> generator.generate())
    .forEach(product -> {
        assertNotNull(product);
        assertEquals(++n, product.longValue());
    });