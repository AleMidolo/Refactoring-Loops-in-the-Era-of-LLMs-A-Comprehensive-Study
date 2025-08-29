for (IdentityEntity identity : identities) {
    String providerName = identity.getProvider().getName();
    providerCountMap.put(providerName, providerCountMap.getOrDefault(providerName, 0) + 1);
}