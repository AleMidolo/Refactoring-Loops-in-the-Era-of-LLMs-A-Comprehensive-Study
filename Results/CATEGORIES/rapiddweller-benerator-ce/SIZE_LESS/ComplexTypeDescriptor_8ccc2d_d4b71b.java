for (ComponentDescriptor descriptor : getComponents()) {
    if (descriptor instanceof IdDescriptor) {
        builder.add(descriptor.getName());
    }
}