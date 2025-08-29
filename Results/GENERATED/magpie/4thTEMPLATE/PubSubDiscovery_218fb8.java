
client.listSubscriptions(ProjectName.of(projectId)).iterateAll().forEach(snapshot -> {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, snapshot.getName())
            .withProjectId(projectId)
            .withResourceType(RESOURCE_TYPE)
            .withConfiguration(GCPUtils.asJsonNode(snapshot))
            .build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":snapshot"), data.toJsonNode()));
});