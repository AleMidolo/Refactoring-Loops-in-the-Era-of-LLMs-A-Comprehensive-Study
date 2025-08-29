return providers.values()
        .stream()
        .map(provider -> provider.getTypeDescriptor(name))
        .filter(descriptor -> descriptor != null)
        .findFirst()
        .orElse(null);