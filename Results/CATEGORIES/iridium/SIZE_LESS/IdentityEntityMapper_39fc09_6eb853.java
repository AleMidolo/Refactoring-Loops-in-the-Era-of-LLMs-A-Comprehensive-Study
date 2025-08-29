for (TenantEntity tenantEntity : entity.getManagedTenants()) {
    response.getTenantIds().add(tenantEntity.getId());
}