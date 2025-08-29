dlpServiceClient.listJobTriggers(ProjectName.of(projectId)).iterateAll()
    .forEach(jobTrigger -> {
        MagpieGcpResource.MagpieGcpResourceBuilder builder = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, jobTrigger.getName())
                .withProjectId(projectId)
                .withResourceType(RESOURCE_TYPE)
                .withConfiguration(GCPUtils.asJsonNode(jobTrigger));
        emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":jobTrigger"), builder.build().toJsonNode()));
    });