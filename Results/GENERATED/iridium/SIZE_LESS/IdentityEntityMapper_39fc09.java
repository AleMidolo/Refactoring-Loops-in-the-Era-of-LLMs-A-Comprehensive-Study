entity.getManagedTenants().stream()
    .map(TenantEntity::getId)
    .forEach(response.getTenantIds()::add);