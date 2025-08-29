for (String languagePrefix : MetaParser.getLanguagePrefixes()) {
    LanguageInfo info = MetaParser.getLanguageInfo(languagePrefix);
    prefixesMap.put(languagePrefix, info);
}