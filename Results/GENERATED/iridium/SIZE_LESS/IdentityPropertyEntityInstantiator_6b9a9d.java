profile.getProfileAttributes().entrySet().stream()
    .map(entrySet -> {
        IdentityPropertyEntity identityProperty = new IdentityPropertyEntity();
        identityProperty.setIdentity(identity);
        identityProperty.setName(entrySet.getKey());
        identityProperty.setValue(entrySet.getValue());
        return identityProperty;
    })
    .forEach(identityProperty -> identity.getIdentityProperties().add(identityProperty));