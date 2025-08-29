client.listSubscriptions(ProjectName.of(projectId)).iterateAll().forEach(subscription -> {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, subscription.getName())
            .withProjectId(projectId)
            .withResourceType(RESOURCE_TYPE)
            .withConfiguration(GCPUtils.asJsonNode(subscription))
            .build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":subscription"), data.toJsonNode()));
});