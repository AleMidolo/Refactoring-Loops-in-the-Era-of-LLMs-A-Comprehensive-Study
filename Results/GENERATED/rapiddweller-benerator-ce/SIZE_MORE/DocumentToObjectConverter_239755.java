document.values().stream()
    .map(value -> {
        if (value instanceof Document) {
            return convertToArray((Document) value);
        } else if (value instanceof Collection) {
            return convertCollection((Collection<?>) value);
        } else if (value != null && value.getClass().isArray()) {
            return convertCollection(List.of(value));
        } else {
            return parseValue(value);
        }
    })
    .forEach(results::add);