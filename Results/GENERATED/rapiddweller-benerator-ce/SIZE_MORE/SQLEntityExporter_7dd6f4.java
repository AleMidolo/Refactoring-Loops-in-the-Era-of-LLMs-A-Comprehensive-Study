components.stream()
    .forEach(entry -> {
        if (first.get()) {
            first.set(false);
        } else {
            builder.append(", ");
        }
        Object value = entry.getValue();
        builder.append(dialect.formatValue(value));
    });