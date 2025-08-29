for (File file : new File(module.getPath() + File.separator + "langs").listFiles(fileFilter)) {
    String lang = file.getName().split("-")[1].split("\\.")[0];
    if (!"en".equals(lang) && !"default".equals(lang)) {
        ObjectNode json = LoadLanguageCommand.loadLanguage(servlet, "core", lang);
        if (json != null && json.has("name")) {
            String label = json.get("name").asText(lang);
            languages.add(new LanguageRecord(lang, label));
        }
    }
}