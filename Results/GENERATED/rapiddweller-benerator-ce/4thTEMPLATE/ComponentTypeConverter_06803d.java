IntStream.range(0, n)
    .mapToObj(i -> (Entity) Array.get(componentValue, i))
    .map(item -> convert(item, (ComplexTypeDescriptor) componentType))
    .forEach(builder::add);