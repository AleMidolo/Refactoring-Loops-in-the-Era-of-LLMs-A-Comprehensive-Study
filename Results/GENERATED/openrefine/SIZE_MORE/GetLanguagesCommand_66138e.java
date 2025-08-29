Arrays.stream(new File(module.getPath() + File.separator + "langs").listFiles(fileFilter))
    .map(File::getName)
    .map(name -> name.split("-")[1].split("\\.")[0])
    .filter(lang -> !"en".equals(lang) && !"default".equals(lang))
    .map(lang -> LoadLanguageCommand.loadLanguage(servlet, "core", lang))
    .filter(Objects::nonNull)
    .filter(json -> json.has("name"))
    .map(json -> json.get("name").asText(lang))
    .forEach(label -> languages.add(new LanguageRecord(lang, label)));