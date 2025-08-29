srcProps.entrySet().stream()
    .filter(entry -> entry.getKey().startsWith("db_"))
    .forEach(entry -> resultProps.put(entry.getKey().substring(3), entry.getValue()));