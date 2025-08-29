propertiesFiles.stream()
    .forEach(propertiesFile -> IncludeStatement.includePropertiesFile(propertiesFile, beneratorContext));