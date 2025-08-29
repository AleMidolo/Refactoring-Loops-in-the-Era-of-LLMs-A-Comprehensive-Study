metricsClient.listLogMetrics(parent).iterateAll().forEach(metric -> {
    MagpieGcpResource data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, metric.getName())
            .withProjectId(projectId)
            .withResourceType(RESOURCE_TYPE)
            .withConfiguration(GCPUtils.asJsonNode(metric))
            .build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":metric"), data.toJsonNode()));
});