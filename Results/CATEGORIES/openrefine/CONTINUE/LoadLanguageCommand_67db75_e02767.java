for (int i = langs.length - 1; i >= 0; i--) {
    if (langs[i] == null)
        continue;
    ObjectNode json = LoadLanguageCommand.loadLanguage(this.servlet, modname, langs[i]);
    if (json == null)
        continue;
    bestLang = langs[i];
    if (translations == null) {
        translations = json;
    } else {
        translations = LoadLanguageCommand.mergeLanguages(json, translations);
    }
}