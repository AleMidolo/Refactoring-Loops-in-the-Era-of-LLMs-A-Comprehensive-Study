externalProviderTemplates.forEach(externalProviderTemplate -> {
    externalProviderTemplate.getAuthorizationParameters().forEach(authorizationParam -> {
        authorizationParam.setProvider(externalProviderTemplate);
    });
    externalProviderTemplate.getAccessTokenParameters().forEach(accessTokenParams -> {
        accessTokenParams.setProvider(externalProviderTemplate);
    });
    entityManager.persist(externalProviderTemplate);
});