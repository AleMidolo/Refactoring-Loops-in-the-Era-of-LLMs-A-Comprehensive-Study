Arrays.stream(DateFormat.getAvailableLocales())
    .filter(l -> l.equals(possibleLocale))
    .findFirst()
    .ifPresent(l -> {
        locale = possibleLocale;
        formats.remove(0);
    });