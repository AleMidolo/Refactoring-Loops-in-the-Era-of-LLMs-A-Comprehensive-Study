entities.stream()
    .map(entity -> entity.get(partName))
    .filter(Objects::nonNull)
    .filter(partValue -> partValue instanceof String)
    .map(partValue -> (String) partValue)
    .forEach(partValue -> counter.count(partValue.length());