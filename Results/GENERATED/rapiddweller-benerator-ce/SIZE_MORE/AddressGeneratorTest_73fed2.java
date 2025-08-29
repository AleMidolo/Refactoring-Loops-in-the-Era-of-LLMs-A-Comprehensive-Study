IntStream.range(0, 100)
    .forEach(i -> {
        Address address = generator.generate();
        logger.debug("{}", address);
        Locale language = address.getCity().getLanguage();
        String languageCode = language.getLanguage();
        String street = address.getStreet();
        
        switch (languageCode) {
            case "de":
                assertTrue(!street.startsWith("Chaussée ") && 
                           !street.startsWith("Route ") && 
                           !street.startsWith("Rue ") && 
                           !street.startsWith("Via "));
                break;
            case "fr":
                assertTrue(!street.endsWith("strasse") && 
                           !street.startsWith("Via "));
                break;
            case "it":
                assertTrue(!street.startsWith("Chaussée ") && 
                           !street.startsWith("Route ") && 
                           !street.startsWith("Rue ") && 
                           !street.endsWith("strasse"));
                break;
            default:
                fail("Illegal language for Switzerland: " + language);
                break;
        }
});