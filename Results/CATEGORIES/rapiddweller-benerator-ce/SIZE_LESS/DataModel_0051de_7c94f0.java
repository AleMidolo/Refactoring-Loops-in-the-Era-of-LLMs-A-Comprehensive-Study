for (DescriptorProvider provider : providers.values()) {
    TypeDescriptor descriptor = provider.getTypeDescriptor(name);
    if (descriptor != null) {
        return descriptor;
    }
}