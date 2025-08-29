for (ExternalIdentityProviderParameterTemplateEntity authorizationParam : template.getAuthorizationParameters()) {
    authorizationParamHashMap.put(authorizationParam.getName(), authorizationParam.getValue());
}