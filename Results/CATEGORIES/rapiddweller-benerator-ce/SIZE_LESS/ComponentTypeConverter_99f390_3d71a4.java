for (Entity item : collection) {
    builder.add(convert(item, (ComplexTypeDescriptor) componentType));
}