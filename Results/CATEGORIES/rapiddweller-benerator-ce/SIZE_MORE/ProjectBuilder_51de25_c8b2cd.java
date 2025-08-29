for (FeatureDetail<?> detail : descriptor.getDetails()) {
    Object value = detail.getValue();
    if (value != null && !isDefaultValue(value, detail.getName())) {
        if (value instanceof Expression) {
            value = ((Expression<?>) value).evaluate(null);
        }
        attributes.put(detail.getName(), toStringConverter.convert(value));
    }
}