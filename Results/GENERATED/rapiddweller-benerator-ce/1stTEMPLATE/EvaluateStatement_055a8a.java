return extensionMap.entrySet()
    .stream()
    .filter(entry -> lcUri.endsWith(entry.getKey()))
    .map(Entry::getValue)
    .findFirst()
    .orElse(null);