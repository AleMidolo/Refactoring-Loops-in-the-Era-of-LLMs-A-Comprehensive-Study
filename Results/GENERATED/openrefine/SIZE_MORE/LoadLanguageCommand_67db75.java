IntStream.range(0, langs.length)
    .mapToObj(i -> langs.length - 1 - i)
    .filter(i -> langs[i] != null)
    .mapToObj(i -> LoadLanguageCommand.loadLanguage(this.servlet, modname, langs[i]))
    .filter(Objects::nonNull)
    .forEach(json -> {
        bestLang = langs[langs.length - 1 - i];
        translations = (translations == null) ? json : LoadLanguageCommand.mergeLanguages(json, translations);
});