a.stream()
    .limit(l)
    .map(JsonValueConverter::convert)
    .anyMatch(value -> testValue(value));