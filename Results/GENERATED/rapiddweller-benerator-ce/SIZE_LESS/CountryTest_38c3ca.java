Country.getInstances().stream()
    .forEach(country -> {
        assertNotNull(country.getDefaultLanguageLocale());
        assertNotNull(country.getIsoCode());
        assertNotNull(country.getDisplayName());
        assertNotNull(country.getName());
        assertNotNull(country.getLocalName());
    });