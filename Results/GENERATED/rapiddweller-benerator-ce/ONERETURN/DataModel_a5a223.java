return providers.values().stream()
        .map(provider -> searchCaseInsensitive(provider, name))
        .filter(Objects::nonNull)
        .findFirst()
        .orElse(null);