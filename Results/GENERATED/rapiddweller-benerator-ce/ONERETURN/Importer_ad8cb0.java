return Arrays.stream(pkgs)
    .map(this::findDescriptorForPackage)
    .filter(Objects::nonNull)
    .findFirst()
    .orElse(null);