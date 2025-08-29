desc.getElements().stream()
    .map(ArrayElementDescriptor::getTypeDescriptor)
    .filter(type -> !(type instanceof ComplexTypeDescriptor))
    .forEach(this::validate);