for (DescriptorProvider provider : providers.values()) {
    for (TypeDescriptor desc : provider.getTypeDescriptors()) {
        validate(desc);
    }
}