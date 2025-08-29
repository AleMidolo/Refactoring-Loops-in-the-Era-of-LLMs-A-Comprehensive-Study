for (Converter<Entity, String> converter : converters) {
    printer.print(converter.convert(entity));
}