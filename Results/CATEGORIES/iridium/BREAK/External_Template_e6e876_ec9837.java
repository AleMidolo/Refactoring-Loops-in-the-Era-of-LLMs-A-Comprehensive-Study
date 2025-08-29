for (ExternalIdentityProviderTemplateEntity providerTemplate : templates) {
    var templateNotFound = true;
    for (ExternalIdentityProviderEntity provider : tenant.getExternalIdentityProviders()) {
        if (provider.getTemplate().getId().equals(providerTemplate.getId())) {
            templateNotFound = false;
            break;
        }
    }
    if (templateNotFound) {
        templatesToReturn.add(providerTemplate);
    }
}