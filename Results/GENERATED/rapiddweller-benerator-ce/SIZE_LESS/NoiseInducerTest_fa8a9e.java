IntStream.range(0, 100)
    .forEach(i -> {
        Number result = inducer.convert(0, -1.0, 1.0);
        assertTrue(result.intValue() >= -1 && result.intValue() <= 1);
    });