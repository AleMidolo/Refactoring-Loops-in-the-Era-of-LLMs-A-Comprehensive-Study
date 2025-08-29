PrimitiveType.getInstances().stream()
    .map(type -> new SimpleTypeDescriptor(type.getName(), this, type.getName()))
    .forEach(this::addTypeDescriptor);