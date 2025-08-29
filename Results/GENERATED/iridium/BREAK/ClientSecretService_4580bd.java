identity.getManagedTenants().stream()
    .filter(tenant -> tenant.getId().equals(tenantId))
    .findFirst()
    .ifPresent(tenant -> isNotAuthorized = false);