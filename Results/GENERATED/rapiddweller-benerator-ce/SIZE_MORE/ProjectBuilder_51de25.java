descriptor.getDetails().stream()
    .filter(detail -> detail.getValue() != null && !isDefaultValue(detail.getValue(), detail.getName()))
    .peek(detail -> {
        if (detail.getValue() instanceof Expression) {
            detail.setValue(((Expression<?>) detail.getValue()).evaluate(null));
        }
    })
    .forEach(detail -> attributes.put(detail.getName(), toStringConverter.convert(detail.getValue()));