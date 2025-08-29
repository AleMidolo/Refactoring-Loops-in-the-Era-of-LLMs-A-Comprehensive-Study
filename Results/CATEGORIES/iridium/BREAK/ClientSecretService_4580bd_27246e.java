for (TenantEntity tenant : identity.getManagedTenants()) {
    if (tenant.getId().equals(tenantId)) {
        isNotAuthorized = false;
        break;
    }
}