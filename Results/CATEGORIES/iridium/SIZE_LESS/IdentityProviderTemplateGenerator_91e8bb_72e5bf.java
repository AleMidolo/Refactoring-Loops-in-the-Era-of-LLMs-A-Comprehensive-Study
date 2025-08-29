for (ExternalIdentityProviderParameterTemplateEntity accessTokenParams : externalProviderTemplate.getAccessTokenParameters()) {
    accessTokenParams.setProvider(externalProviderTemplate);
}