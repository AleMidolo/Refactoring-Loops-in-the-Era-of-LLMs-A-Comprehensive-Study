module.getPath() + File.separator + "langs")
.listFiles(fileFilter)
.stream()
.map(file -> file.getName().split("-")[1].split("\\.")[0])
.filter(lang -> !"en".equals(lang) && !"default".equals(lang))
.map(lang -> LoadLanguageCommand.loadLanguage(servlet, "core", lang))
.filter(json -> json != null && json.has("name"))
.map(json -> json.get("name").asText(lang))
.forEach(label -> languages.add(new LanguageRecord(lang, label)));