for (TenantEntity managedTenant : identity.getManagedTenants()) {
    if (managedTenant.getId().equals(tenantId)) {
        isManagedTenant = true;
        break;
    }
}