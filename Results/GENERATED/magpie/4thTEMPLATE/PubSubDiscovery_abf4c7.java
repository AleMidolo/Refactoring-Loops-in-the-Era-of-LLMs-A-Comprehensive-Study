client.listSubscriptions(ProjectName.of(projectId)).iterateAll().stream()
    .map(subscription -> new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, subscription.getName())
        .withProjectId(projectId)
        .withResourceType(RESOURCE_TYPE)
        .withConfiguration(GCPUtils.asJsonNode(subscription))
        .build())
    .map(data -> VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":subscription"), data.toJsonNode()))
    .forEach(emitter::emit);