providers.values().stream()
    .flatMap(provider -> provider.getTypeDescriptors().stream())
    .forEach(this::validate);