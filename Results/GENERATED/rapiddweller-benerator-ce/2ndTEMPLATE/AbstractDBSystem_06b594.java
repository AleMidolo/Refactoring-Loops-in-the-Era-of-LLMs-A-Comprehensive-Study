return catalog.getSchemas().stream()
    .map(schema -> schema.getTable(tableName))
    .filter(Objects::nonNull)
    .findFirst()
    .orElse(null);