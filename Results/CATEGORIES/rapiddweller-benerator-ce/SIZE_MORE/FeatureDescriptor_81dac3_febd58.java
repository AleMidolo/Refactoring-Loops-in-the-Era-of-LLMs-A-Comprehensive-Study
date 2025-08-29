for (FeatureDetail<?> descriptor : details.values()) {
    if (descriptor.getValue() != null && !NAME.equals(descriptor.getName())) {
        if (!empty) {
            builder.append(", ");
        }
        empty = false;
        builder.append(descriptor.getName()).append("=");
        builder.append(ToStringConverter.convert(descriptor.getValue(), "[null]"));
    }
}