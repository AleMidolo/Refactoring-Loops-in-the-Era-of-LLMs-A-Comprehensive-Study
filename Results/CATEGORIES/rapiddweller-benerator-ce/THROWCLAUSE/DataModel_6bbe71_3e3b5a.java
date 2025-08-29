for (ComponentDescriptor component : desc.getComponents()) {
    TypeDescriptor type = component.getTypeDescriptor();
    if (type == null) {
        throw BeneratorExceptionFactory.getInstance().configurationError("Type of component is not defined: " + desc.getName());
    } else if (!(type instanceof ComplexTypeDescriptor)) {
        validate(type);
    }
}