values.putAll(MAP.entrySet().stream()
    .collect(Collectors.toMap(Map.Entry::getKey, entry -> String.valueOf(entry.getValue().getCursor()))));