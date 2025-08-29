for (IdentityEntity identity : identities) {
    String providerName = identity.getProvider().getDisplayName();
    providerCountMap.put(providerName, providerCountMap.getOrDefault(providerName, 0) + 1);
}