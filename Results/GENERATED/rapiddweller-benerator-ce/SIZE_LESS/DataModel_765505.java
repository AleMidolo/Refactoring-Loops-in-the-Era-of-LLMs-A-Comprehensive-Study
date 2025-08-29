return provider.getTypeDescriptors().stream()
    .filter(type -> type.getName().equals(name))
    .findFirst()
    .orElse(null);