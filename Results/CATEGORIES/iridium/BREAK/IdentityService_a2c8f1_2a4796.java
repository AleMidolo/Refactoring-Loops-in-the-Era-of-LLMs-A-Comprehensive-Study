for (TenantEntity tenant : identity.getManagedTenants()) {
    if (tenant.getId().equalsIgnoreCase(tenantId)) {
        isNotManagedTenant = false;
        break;
    }
}