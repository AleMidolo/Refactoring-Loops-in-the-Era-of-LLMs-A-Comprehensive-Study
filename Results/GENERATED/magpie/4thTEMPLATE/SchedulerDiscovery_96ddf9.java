cloudSchedulerClient.listJobs(parent.toString()).iterateAll().forEach(job ->
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":job"),
        new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, job.getName())
            .withProjectId(projectId)
            .withResourceType(RESOURCE_TYPE)
            .withRegion(location)
            .withConfiguration(GCPUtils.asJsonNode(job))
            .build().toJsonNode()
    )
);