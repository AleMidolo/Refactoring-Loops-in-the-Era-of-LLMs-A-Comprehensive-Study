traceServiceClient.listTraces(projectId).iterateAll().stream()
    .map(trace -> new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, trace.getTraceId())
            .withProjectId(projectId)
            .withResourceType(RESOURCE_TYPE)
            .withConfiguration(GCPUtils.asJsonNode(trace)).build())
    .forEach(data -> emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":trace"), data.toJsonNode()));