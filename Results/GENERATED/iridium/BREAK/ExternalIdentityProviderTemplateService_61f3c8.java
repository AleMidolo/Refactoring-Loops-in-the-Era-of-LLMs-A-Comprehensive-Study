tenant.getExternalIdentityProviders().stream()
    .filter(provider -> provider.getTemplate().getId().equals(providerTemplate.getId()))
    .findFirst()
    .ifPresent(provider -> templateNotFound = false);