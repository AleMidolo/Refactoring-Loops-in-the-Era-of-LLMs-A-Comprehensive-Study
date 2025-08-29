boolean isNotAuthorized = identity.getManagedTenants().stream()
        .anyMatch(tenant -> tenant.getId().equals(tenantId));