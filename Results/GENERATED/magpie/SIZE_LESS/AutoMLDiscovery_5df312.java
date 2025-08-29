client.listDatasets(parent).iterateAll().stream()
    .map(element -> new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, element.getName())
            .withProjectId(projectId)
            .withResourceType(RESOURCE_TYPE)
            .withRegion(location)
            .withConfiguration(GCPUtils.asJsonNode(element))
            .build())
    .forEach(data -> emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":dataset"), data.toJsonNode()));