cloudBuildClient.listBuilds(projectId, "").iterateAll()
    .forEach(element -> {
        var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, element.getName())
                                .withProjectId(projectId)
                                .withResourceType(RESOURCE_TYPE)
                                .withConfiguration(GCPUtils.asJsonNode(element))
                                .build();
        emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":builds"), data.toJsonNode()));
    });