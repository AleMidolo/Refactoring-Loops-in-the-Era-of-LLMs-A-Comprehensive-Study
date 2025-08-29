for (Map.Entry<String, String> entrySet : profile.getProfileAttributes().entrySet()) {
    final var identityProperty = new IdentityPropertyEntity();
    identityProperty.setIdentity(identity);
    identityProperty.setName(entrySet.getKey());
    identityProperty.setValue(entrySet.getValue());
    identity.getIdentityProperties().add(identityProperty);
}