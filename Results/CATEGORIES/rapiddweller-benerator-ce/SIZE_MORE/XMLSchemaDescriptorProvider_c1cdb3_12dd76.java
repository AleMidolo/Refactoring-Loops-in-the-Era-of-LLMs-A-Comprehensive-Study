for (TypeDescriptor type : typeMap.values()) {
    if (type instanceof UnresolvedTypeDescriptor) {
        TypeDescriptor parent = type.getParent();
        if (parent instanceof SimpleTypeDescriptor) {
            addTypeDescriptor(new SimpleTypeDescriptor(type.getName(), this, type.getParentName()));
        } else if (parent instanceof ComplexTypeDescriptor) {
            addTypeDescriptor(new ComplexTypeDescriptor(type.getName(), this, type.getParentName()));
        } else if (parent == null) {
            throw BeneratorExceptionFactory.getInstance().configurationError("parentType " + type.getParentName() + " not found for " + type.getName());
        } else {
            unresolved = true;
        }
    }
}