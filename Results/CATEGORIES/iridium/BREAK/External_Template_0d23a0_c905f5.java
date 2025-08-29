for (ExternalIdentityProviderEntity provider : tenant.getExternalIdentityProviders()) {
    if (provider.getTemplate().getId().equals(providerTemplate.getId())) {
        templateNotFound = false;
        break;
    }
}