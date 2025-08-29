IntStream.range(0, 1000)
    .forEach(i -> {
        Date day = generator.generate();
        assertNotNull(day);
        assertEquals(day, min);
    });