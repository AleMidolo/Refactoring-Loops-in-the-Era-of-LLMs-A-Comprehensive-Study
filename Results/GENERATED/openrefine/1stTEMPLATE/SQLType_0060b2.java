return jdbcDriverRegistry.values()
    .stream()
    .filter(sqlType -> sqlType.getIdentifier().equalsIgnoreCase(name))
    .findFirst()
    .orElse(null);