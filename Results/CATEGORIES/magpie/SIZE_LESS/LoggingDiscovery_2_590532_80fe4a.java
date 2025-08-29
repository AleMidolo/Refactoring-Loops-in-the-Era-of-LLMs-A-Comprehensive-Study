for (var sink : configClient.listSinks(parent).iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, sink.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(sink)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":sink"), data.toJsonNode()));
}