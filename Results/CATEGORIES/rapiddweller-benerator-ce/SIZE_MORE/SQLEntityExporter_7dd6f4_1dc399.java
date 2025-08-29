for (Entry<String, Object> entry : components) {
    if (first) {
        first = false;
    } else {
        builder.append(", ");
    }
    Object value = entry.getValue();
    builder.append(dialect.formatValue(value));
}