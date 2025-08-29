boolean isNotManagedTenant = identity.getManagedTenants().stream()
    .anyMatch(tenant -> tenant.getId().equalsIgnoreCase(tenantId));