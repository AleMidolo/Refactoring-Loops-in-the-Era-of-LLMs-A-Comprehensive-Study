IntStream.range(0, 100)
    .mapToObj(i -> generator.generate())
    .forEach(country -> {
        assertNotNull(country);
        assertNotNull(Country.getInstance(country.getIsoCode()));
    });