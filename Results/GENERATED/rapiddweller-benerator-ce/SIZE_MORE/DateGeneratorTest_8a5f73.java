IntStream.range(0, 10000)
    .mapToObj(i -> generator.generate())
    .forEach(date -> {
        assertNotNull(date);
        assertFalse(date.before(min));
        assertFalse(date.after(max));
        long time = date.getTime();
        long time0 = min.getTime();
        assertEquals(0, (time - time0) % granularity);
    });