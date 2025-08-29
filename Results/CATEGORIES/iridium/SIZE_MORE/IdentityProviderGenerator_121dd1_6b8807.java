for (ExternalIdentityProviderTemplateEntity template : templates) {
    for (ExternalIdentityProviderEntity externalProvider : externalProviders) {
        if (template.getName().equals(externalProvider.getName())) {
            externalProvider.setTemplate(template);
            externalProvider.setAccessTokenRequestBaseUrl(template.getAccessTokenRequestBaseUrl());
            externalProvider.setProfileRequestBaseUrl(template.getProfileRequestBaseUrl());
            externalProvider.setIconPath(template.getIconPath());
            externalProvider.setDisplayName(template.getDisplayName());
            externalProvider.setTenant(iridiumTenant);
            externalProvider.setBaseAuthorizationUrl(template.getBaseAuthorizationUrl());
            final var authorizationParamHashMap = new HashMap<String, String>();
            for (ExternalIdentityProviderParameterTemplateEntity authorizationParam : template.getAuthorizationParameters()) {
                authorizationParamHashMap.put(authorizationParam.getName(), authorizationParam.getValue());
            }
            externalProvider.setAuthorizationParameters(authorizationParamHashMap);
            final var accessTokenParamHashMap = new HashMap<String, String>();
            for (ExternalIdentityProviderParameterTemplateEntity accessTokenParam : template.getAccessTokenParameters()) {
                accessTokenParamHashMap.put(accessTokenParam.getName(), accessTokenParam.getValue());
            }
            externalProvider.setAccessTokenParameters(accessTokenParamHashMap);
            externalProvider.setScope(template.getDefaultScope());
            entityManager.persist(externalProvider);
        }
    }
}