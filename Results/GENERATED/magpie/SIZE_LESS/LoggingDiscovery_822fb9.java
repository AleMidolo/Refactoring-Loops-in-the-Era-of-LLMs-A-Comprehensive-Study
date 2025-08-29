metricsClient.listLogMetrics(parent).iterateAll().stream()
    .map(metric -> new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, metric.getName())
        .withProjectId(projectId)
        .withResourceType(RESOURCE_TYPE)
        .withConfiguration(GCPUtils.asJsonNode(metric))
        .build())
    .forEach(data -> emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":metric"), data.toJsonNode()));