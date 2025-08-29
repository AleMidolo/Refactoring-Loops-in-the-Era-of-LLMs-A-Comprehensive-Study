translationServiceClient.listGlossaries(parent).iterateAll().forEach(glossary -> {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, glossary.getName())
            .withProjectId(projectId)
            .withResourceType(RESOURCE_TYPE)
            .withRegion(location)
            .withConfiguration(GCPUtils.asJsonNode(glossary))
            .build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":glossary"), data.toJsonNode()));
});