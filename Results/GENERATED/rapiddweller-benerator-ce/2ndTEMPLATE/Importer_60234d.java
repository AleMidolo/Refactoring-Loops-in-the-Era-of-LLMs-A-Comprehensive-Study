return Arrays.stream(pkgs)
             .map(this::findDomainDescriptorForPackage)
             .filter(Objects::nonNull)
             .findFirst()
             .orElse(null);