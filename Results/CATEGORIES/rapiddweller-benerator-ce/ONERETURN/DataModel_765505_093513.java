for (TypeDescriptor type : provider.getTypeDescriptors()) {
    if (type.getName().equals(name)) {
        return type;
    }
}