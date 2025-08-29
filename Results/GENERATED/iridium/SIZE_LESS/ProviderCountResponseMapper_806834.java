identities.stream()
    .map(IdentityEntity::getProvider)
    .map(ProviderEntity::getName)
    .forEach(providerName -> providerCountMap.put(providerName, providerCountMap.getOrDefault(providerName, 0) + 1);