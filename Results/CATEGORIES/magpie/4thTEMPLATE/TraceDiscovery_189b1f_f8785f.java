for (var trace : traceServiceClient.listTraces(projectId).iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, trace.getTraceId()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(trace)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":trace"), data.toJsonNode()));
}