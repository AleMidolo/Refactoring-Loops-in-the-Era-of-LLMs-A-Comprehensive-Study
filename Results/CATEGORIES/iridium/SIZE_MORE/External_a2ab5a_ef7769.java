for (ExternalIdentityProviderEntity provider : providers) {
    final var response = new ExternalProviderLoginDescriptorResponse();
    response.setScope(provider.getScope());
    response.setClientId(provider.getClientId());
    response.setIconPath(provider.getIconPath());
    response.setResponseType("code");
    response.setName(provider.getName());
    response.setDisplayName(provider.getDisplayName());
    responses.add(response);
}