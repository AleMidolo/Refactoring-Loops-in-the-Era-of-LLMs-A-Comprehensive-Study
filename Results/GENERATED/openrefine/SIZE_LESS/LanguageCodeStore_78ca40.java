languages.stream()
        .map(language -> language.path("code").textValue())
        .forEach(supportedLangCodes::add);