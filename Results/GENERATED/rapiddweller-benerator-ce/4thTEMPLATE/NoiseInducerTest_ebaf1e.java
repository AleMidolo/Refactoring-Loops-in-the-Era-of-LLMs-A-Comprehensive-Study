IntStream.range(0, 100)
    .forEach(i -> {
        Number result = inducer.convert(0.);
        assertTrue(result.intValue() >= -2. && result.intValue() <= 2.);
    });