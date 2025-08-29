ExternalIdentityProviderEntity provider = tenant.getExternalIdentityProviders().stream()
        .filter(p -> p.getName().equalsIgnoreCase(providerName) && p.isActive())
        .findFirst()
        .orElse(null);