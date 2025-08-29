Arrays.stream(langs)
        .filter(Objects::nonNull)
        .map(lang -> LoadLanguageCommand.loadLanguage(this.servlet, modname, lang))
        .filter(Objects::nonNull)
        .reduce((json1, json2) -> LoadLanguageCommand.mergeLanguages(json1, json2))
        .ifPresent(json -> {
            bestLang = langs[langs.length - 1];
            translations = json;
        });