getComponents().stream()
    .filter(descriptor -> descriptor instanceof IdDescriptor)
    .forEach(descriptor -> builder.add(descriptor.getName()));