IntStream.range(0, 100)
    .forEach(i -> {
        context.set("num", i);
        assertEquals(1000 + i / 2, generator.generate().intValue());
        context.set("num", i+1);
        assertEquals(2000 + (i + 1) / 2, generator.generate().intValue());
    });