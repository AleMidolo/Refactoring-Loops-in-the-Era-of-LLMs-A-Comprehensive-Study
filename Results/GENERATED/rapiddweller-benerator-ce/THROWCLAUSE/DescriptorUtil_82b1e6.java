beans.stream()
    .map(bean -> {
        Converter converter;
        if (bean instanceof java.text.Format) {
            converter = new FormatFormatConverter(Object.class, (java.text.Format) bean, false);
        } else if (bean instanceof Converter) {
            converter = (Converter) bean;
        } else {
            throw BeneratorExceptionFactory.getInstance().configurationError(bean + " is not an instance of " + Converter.class);
        }
        return BeneratorFactory.getInstance().configureConverter(converter, context);
    })
    .reduce(null, (result, converter) -> {
        if (result == null) {
            return converter;
        } else if (result instanceof ConverterChain) {
            ((ConverterChain) result).addComponent(converter);
            return result;
        } else {
            return new ConverterChain(result, converter);
        }
    });