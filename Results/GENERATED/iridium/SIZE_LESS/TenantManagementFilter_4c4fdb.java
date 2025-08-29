boolean isManagedTenant = identity.getManagedTenants().stream()
        .anyMatch(managedTenant -> managedTenant.getId().equals(tenantId));