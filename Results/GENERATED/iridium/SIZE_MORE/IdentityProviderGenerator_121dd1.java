templates.stream()
    .flatMap(template -> externalProviders.stream()
        .filter(externalProvider -> template.getName().equals(externalProvider.getName()))
        .peek(externalProvider -> {
            externalProvider.setTemplate(template);
            externalProvider.setAccessTokenRequestBaseUrl(template.getAccessTokenRequestBaseUrl());
            externalProvider.setProfileRequestBaseUrl(template.getProfileRequestBaseUrl());
            externalProvider.setIconPath(template.getIconPath());
            externalProvider.setDisplayName(template.getDisplayName());
            externalProvider.setTenant(iridiumTenant);
            externalProvider.setBaseAuthorizationUrl(template.getBaseAuthorizationUrl());
            final var authorizationParamHashMap = template.getAuthorizationParameters().stream()
                .collect(Collectors.toMap(ExternalIdentityProviderParameterTemplateEntity::getName, ExternalIdentityProviderParameterTemplateEntity::getValue));
            externalProvider.setAuthorizationParameters(authorizationParamHashMap);
            final var accessTokenParamHashMap = template.getAccessTokenParameters().stream()
                .collect(Collectors.toMap(ExternalIdentityProviderParameterTemplateEntity::getName, ExternalIdentityProviderParameterTemplateEntity::getValue));
            externalProvider.setAccessTokenParameters(accessTokenParamHashMap);
            externalProvider.setScope(template.getDefaultScope());
            entityManager.persist(externalProvider);
        }))
    .count();