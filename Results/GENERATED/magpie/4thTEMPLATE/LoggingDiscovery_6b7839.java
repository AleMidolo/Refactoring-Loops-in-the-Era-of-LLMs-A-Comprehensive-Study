configClient.listExclusions(parent).iterateAll().stream()
    .map(exclusion -> new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, exclusion.getName())
            .withProjectId(projectId)
            .withResourceType(RESOURCE_TYPE)
            .withConfiguration(GCPUtils.asJsonNode(exclusion))
            .build())
    .map(data -> VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":exclusion"), data.toJsonNode()))
    .forEach(emitter::emit);