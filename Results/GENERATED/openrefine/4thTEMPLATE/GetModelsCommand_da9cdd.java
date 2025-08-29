MetaParser.getLanguagePrefixes().stream()
    .map(languagePrefix -> MetaParser.getLanguageInfo(languagePrefix))
    .forEach(info -> prefixesMap.put(languagePrefix, info));