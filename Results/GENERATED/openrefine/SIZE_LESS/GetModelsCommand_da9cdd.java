MetaParser.getLanguagePrefixes()
    .stream()
    .forEach(languagePrefix -> prefixesMap.put(languagePrefix, MetaParser.getLanguageInfo(languagePrefix));