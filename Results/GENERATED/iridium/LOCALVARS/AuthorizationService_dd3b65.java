ExternalIdentityProviderEntity provider = tenant.getExternalIdentityProviders().stream()
        .filter(providerEntity -> providerEntity.getName().equalsIgnoreCase(providerName) && providerEntity.isActive())
        .findFirst().orElse(null);