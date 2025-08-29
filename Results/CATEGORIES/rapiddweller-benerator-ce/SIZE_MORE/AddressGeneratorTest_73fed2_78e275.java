for (int i = 0; i < 100; i++) {
    Address address = generator.generate();
    logger.debug("{}", address);
    Locale language = address.getCity().getLanguage();
    String languageCode = language.getLanguage();
    String street = address.getStreet();
    if ("de".equals(languageCode)) {
        assertFalse(street.startsWith("Chaussée "));
        assertFalse(street.startsWith("Route "));
        assertFalse(street.startsWith("Rue "));
        assertFalse(street.startsWith("Via "));
    } else if ("fr".equals(languageCode)) {
        assertFalse(street.endsWith("strasse"));
        assertFalse(street.startsWith("Via "));
    } else if ("it".equals(languageCode)) {
        assertFalse(street.startsWith("Chaussée "));
        assertFalse(street.startsWith("Route "));
        assertFalse(street.startsWith("Rue "));
        assertFalse(street.endsWith("strasse"));
    } else {
        fail("Illegal language for Switzerland: " + language);
    }
}