for (Object value : document.values()) {
    if (value instanceof Document) {
        results.add(convertToArray((Document) value));
    } else if (value instanceof Collection) {
        results.add(convertCollection((Collection<?>) value));
    } else if (value != null && value.getClass().isArray()) {
        results.add(convertCollection(List.of(value)));
    } else {
        results.add(parseValue(value));
    }
}