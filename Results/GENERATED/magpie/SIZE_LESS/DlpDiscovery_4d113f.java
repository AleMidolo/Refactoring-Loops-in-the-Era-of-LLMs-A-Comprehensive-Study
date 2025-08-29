dlpServiceClient.listDlpJobs(ProjectName.of(projectId)).iterateAll().forEach(dlpJob -> {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, dlpJob.getName())
            .withProjectId(projectId)
            .withResourceType(RESOURCE_TYPE)
            .withConfiguration(GCPUtils.asJsonNode(dlpJob))
            .build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":dlpJob"), data.toJsonNode()));
});