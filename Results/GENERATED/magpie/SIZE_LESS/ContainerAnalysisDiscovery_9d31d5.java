client.listOccurrences(ProjectName.of(projectId).toString(), "")
    .iterateAll()
    .forEach(occurrence -> {
        MagpieGcpResource.MagpieGcpResourceBuilder builder = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, occurrence.getName())
            .withProjectId(projectId)
            .withResourceType(RESOURCE_TYPE)
            .withConfiguration(GCPUtils.asJsonNode(occurrence));
        emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":occurrence"), builder.build().toJsonNode()));
    });