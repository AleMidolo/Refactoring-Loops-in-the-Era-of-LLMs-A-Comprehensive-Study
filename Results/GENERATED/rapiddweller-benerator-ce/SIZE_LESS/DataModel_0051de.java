return providers.values().stream()
        .map(provider -> provider.getTypeDescriptor(name))
        .filter(Objects::nonNull)
        .findFirst()
        .orElse(null);