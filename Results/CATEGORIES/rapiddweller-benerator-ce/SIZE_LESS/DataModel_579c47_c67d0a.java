for (ArrayElementDescriptor element : desc.getElements()) {
    TypeDescriptor type = element.getTypeDescriptor();
    if (!(type instanceof ComplexTypeDescriptor)) {
        validate(type);
    }
}