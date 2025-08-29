for (int i = 0; i < 100; i++) {
    Country country = generator.generate();
    assertNotNull(country);
    assertNotNull(Country.getInstance(country.getIsoCode()));
}