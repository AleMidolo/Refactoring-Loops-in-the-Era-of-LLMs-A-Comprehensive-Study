for (ExternalIdentityProviderTemplateEntity externalProviderTemplate : externalProviderTemplates) {
    for (ExternalIdentityProviderParameterTemplateEntity authorizationParam : externalProviderTemplate.getAuthorizationParameters()) {
        authorizationParam.setProvider(externalProviderTemplate);
    }
    for (ExternalIdentityProviderParameterTemplateEntity accessTokenParams : externalProviderTemplate.getAccessTokenParameters()) {
        accessTokenParams.setProvider(externalProviderTemplate);
    }
    entityManager.persist(externalProviderTemplate);
}