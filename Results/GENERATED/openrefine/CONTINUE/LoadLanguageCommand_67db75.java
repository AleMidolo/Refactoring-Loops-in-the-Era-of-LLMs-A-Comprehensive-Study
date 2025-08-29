IntStream.range(0, langs.length)
    .mapToObj(i -> langs[langs.length - 1 - i])
    .filter(Objects::nonNull)
    .map(lang -> LoadLanguageCommand.loadLanguage(this.servlet, modname, lang))
    .filter(Objects::nonNull)
    .forEach(json -> {
        bestLang = lang;
        translations = translations == null ? json : LoadLanguageCommand.mergeLanguages(json, translations);
    });