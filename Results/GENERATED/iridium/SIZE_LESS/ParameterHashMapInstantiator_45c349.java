parameterTemplates.stream()
    .collect(Collectors.toMap(ExternalIdentityProviderParameterTemplateEntity::getName, ExternalIdentityProviderParameterTemplateEntity::getValue));