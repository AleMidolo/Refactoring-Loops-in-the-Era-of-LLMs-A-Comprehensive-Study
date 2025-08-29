client.listTransferConfigs(parent).iterateAll().stream()
    .map(dataSource -> new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, dataSource.getName())
        .withProjectId(projectId)
        .withResourceType(RESOURCE_TYPE)
        .withRegion(location)
        .withConfiguration(GCPUtils.asJsonNode(dataSource))
        .build())
    .forEach(data -> {
        discoverTransferRuns(client, dataSource, data);
        emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":transferConfig"), data.toJsonNode()));
    });