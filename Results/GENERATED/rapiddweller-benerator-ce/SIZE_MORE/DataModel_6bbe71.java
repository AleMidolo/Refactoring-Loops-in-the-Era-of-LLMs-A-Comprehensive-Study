desc.getComponents().stream()
    .map(ComponentDescriptor::getTypeDescriptor)
    .filter(Objects::isNull)
    .findFirst()
    .ifPresent(type -> {
        throw BeneratorExceptionFactory.getInstance()
            .configurationError("Type of component is not defined: " + desc.getName());
    });

desc.getComponents().stream()
    .map(ComponentDescriptor::getTypeDescriptor)
    .filter(type -> !(type instanceof ComplexTypeDescriptor))
    .forEach(this::validate);