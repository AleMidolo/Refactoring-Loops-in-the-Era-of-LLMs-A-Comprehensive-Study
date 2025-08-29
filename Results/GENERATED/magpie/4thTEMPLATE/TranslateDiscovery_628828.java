translationServiceClient.listGlossaries(parent).iterateAll().stream()
    .map(glossary -> new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, glossary.getName())
            .withProjectId(projectId)
            .withResourceType(RESOURCE_TYPE)
            .withRegion(location)
            .withConfiguration(GCPUtils.asJsonNode(glossary))
            .build())
    .forEach(data -> emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":glossary"), data.toJsonNode()));