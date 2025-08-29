realmsServiceClient.listRealms(formattedParent)
    .iterateAll()
    .forEach(realm -> {
        MagpieGcpResource.MagpieGcpResourceBuilder builder = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, realm.getName())
            .withProjectId(projectId)
            .withResourceType(RESOURCE_TYPE)
            .withConfiguration(GCPUtils.asJsonNode(realm));
        
        MagpieGcpResource data = builder.build();
        
        emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":realm"), data.toJsonNode()));
    });