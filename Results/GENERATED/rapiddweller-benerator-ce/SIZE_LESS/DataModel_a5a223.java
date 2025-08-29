return providers.values().stream()
        .map(provider -> searchCaseInsensitive(provider, name))
        .filter(descriptor -> descriptor != null)
        .findFirst()
        .orElse(null);