for (ExternalIdentityProviderEntity providerEntity : tenant.getExternalIdentityProviders()) {
    if (providerEntity.getName().equalsIgnoreCase(providerName) && providerEntity.isActive()) {
        providerFound = true;
        provider = providerEntity;
    }
}