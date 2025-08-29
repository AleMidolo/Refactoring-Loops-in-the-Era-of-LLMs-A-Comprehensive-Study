for (DescriptorProvider provider : providers.values()) {
    TypeDescriptor descriptor = searchCaseInsensitive(provider, name);
    if (descriptor != null) {
        return descriptor;
    }
}