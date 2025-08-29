for (int i = 0; i < n; i++) {
    Entity item = (Entity) Array.get(componentValue, i);
    builder.add(convert(item, (ComplexTypeDescriptor) componentType));
}