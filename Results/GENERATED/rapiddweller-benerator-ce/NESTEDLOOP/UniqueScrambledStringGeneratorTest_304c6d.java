IntStream.range(0, 30)
    .forEach(n -> {
        int exp = (int) Math.round(Math.pow(2, n)) + (int) Math.round(Math.pow(2, n + 1));
        IntStream.range(0, exp)
            .forEach(c -> assertNotNull(generator.generate()));
        assertNull(generator.generate());
        generator.reset();
    });