client.listSubscriptions(ProjectName.of(projectId)).iterateAll().stream()
    .map(snapshot -> new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, snapshot.getName())
            .withProjectId(projectId)
            .withResourceType(RESOURCE_TYPE)
            .withConfiguration(GCPUtils.asJsonNode(snapshot))
            .build())
    .forEach(data -> emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":snapshot"), data.toJsonNode()));