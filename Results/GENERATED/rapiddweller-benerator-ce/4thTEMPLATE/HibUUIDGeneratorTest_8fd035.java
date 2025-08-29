IntStream.range(0, 5)
    .forEach(i -> {
        String id = generator.generate();
        assertEquals(32, id.length());
    });