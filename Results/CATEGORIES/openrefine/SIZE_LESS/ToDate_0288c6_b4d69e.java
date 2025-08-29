for (Locale l : DateFormat.getAvailableLocales()) {
    if (l.equals(possibleLocale)) {
        locale = possibleLocale;
        formats.remove(0);
    }
}