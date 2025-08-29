for (Object bean : beans) {
    Converter converter;
    if (bean instanceof java.text.Format) {
        converter = new FormatFormatConverter(Object.class, (java.text.Format) bean, false);
    } else if (bean instanceof Converter) {
        converter = (Converter) bean;
    } else {
        throw BeneratorExceptionFactory.getInstance().configurationError(bean + " is not an instance of " + Converter.class);
    }
    converter = BeneratorFactory.getInstance().configureConverter(converter, context);
    if (result == null) {
        result = converter;
    } else if (result instanceof ConverterChain) {
        ((ConverterChain) result).addComponent(converter);
    } else {
        result = new ConverterChain(result, converter);
    }
}