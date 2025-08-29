identities.stream()
    .map(identity -> identity.getProvider().getName())
    .forEach(providerName -> providerCountMap.put(providerName, providerCountMap.getOrDefault(providerName, 0) + 1);