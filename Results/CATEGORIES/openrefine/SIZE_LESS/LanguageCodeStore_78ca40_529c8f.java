for (JsonNode language : languages) {
    supportedLangCodes.add(language.path("code").textValue());
}