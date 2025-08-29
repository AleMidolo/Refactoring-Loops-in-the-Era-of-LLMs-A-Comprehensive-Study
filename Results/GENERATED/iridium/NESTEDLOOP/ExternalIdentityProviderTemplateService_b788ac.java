templates.stream()
    .filter(providerTemplate -> tenant.getExternalIdentityProviders().stream()
        .noneMatch(provider -> provider.getTemplate().getId().equals(providerTemplate.getId())))
    .forEach(templatesToReturn::add);