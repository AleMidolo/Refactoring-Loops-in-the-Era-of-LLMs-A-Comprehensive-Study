for (int i = 0; i < descriptors.length; i++) {
    FixedWidthColumnDescriptor descriptor = descriptors[i];
    ConverterChain<Entity, String> chain = new ConverterChain<>();
    chain.addComponent(new AccessingConverter<>(Entity.class, Object.class, new ComponentAccessor(descriptor.getName())));
    chain.addComponent(new FormatFormatConverter(String.class, descriptor.getFormat(), true));
    this.converters[i] = chain;
}