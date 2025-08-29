for (Country country : Country.getInstances()) {
    assertNotNull(country.getDefaultLanguageLocale());
    assertNotNull(country.getIsoCode());
    assertNotNull(country.getDisplayName());
    assertNotNull(country.getName());
    assertNotNull(country.getLocalName());
}