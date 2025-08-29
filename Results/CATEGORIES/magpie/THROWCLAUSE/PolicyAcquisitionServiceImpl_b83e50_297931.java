for (String ruleFileName : ruleFileNames) {
    try {
        File ruleFile = new File(rulesDirectory + "/" + ruleFileName);
        Rule yamlRule = YAML_MAPPER.readValue(ruleFile, Rule.class);
        yamlRule.setFileName(ruleFileName);
        if (yamlRule.getSql() != null) {
            yamlRule.setSql(yamlRule.getSql().replaceAll(SQL_SCHEMA_TOKEN, schema));
        }
        rules.add(yamlRule);
        LOGGER.info("Successfully loaded rule {}", yamlRule.getId());
    } catch (IOException yamlIOException) {
        LOGGER.error(yamlIOException.getMessage());
    }
}