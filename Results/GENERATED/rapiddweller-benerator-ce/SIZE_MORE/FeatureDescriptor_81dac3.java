details.values().stream()
    .filter(descriptor -> descriptor.getValue() != null && !NAME.equals(descriptor.getName()))
    .forEach(descriptor -> {
        if (!empty) {
            builder.append(", ");
        }
        empty = false;
        builder.append(descriptor.getName()).append("=");
        builder.append(ToStringConverter.convert(descriptor.getValue(), "[null]"));
    });