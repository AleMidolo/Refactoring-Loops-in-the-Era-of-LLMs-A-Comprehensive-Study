identities.stream()
        .map(identity -> identity.getProvider().getDisplayName())
        .forEach(providerName -> providerCountMap.put(providerName, providerCountMap.getOrDefault(providerName, 0) + 1);