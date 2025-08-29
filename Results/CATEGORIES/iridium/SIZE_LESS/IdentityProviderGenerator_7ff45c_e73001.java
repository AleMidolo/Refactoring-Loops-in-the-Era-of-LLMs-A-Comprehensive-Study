for (ExternalIdentityProviderParameterTemplateEntity accessTokenParam : template.getAccessTokenParameters()) {
    accessTokenParamHashMap.put(accessTokenParam.getName(), accessTokenParam.getValue());
}