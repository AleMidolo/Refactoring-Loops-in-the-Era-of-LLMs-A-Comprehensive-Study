for (ExternalIdentityProviderParameterTemplateEntity authorizationParam : externalProviderTemplate.getAuthorizationParameters()) {
    authorizationParam.setProvider(externalProviderTemplate);
}