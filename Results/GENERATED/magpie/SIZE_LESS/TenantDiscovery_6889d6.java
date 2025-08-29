```java
tenantServiceClient.listTenants(ProjectName.of(projectId))
    .iterateAll().forEach(tenant -> {
        var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, tenant.getName())
            .withProjectId(projectId)
            .withResourceType(RESOURCE_TYPE)
            .withConfiguration(GCPUtils.asJsonNode(tenant))
            .build();
        emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":tenant"), data.toJsonNode()));
    });
```  