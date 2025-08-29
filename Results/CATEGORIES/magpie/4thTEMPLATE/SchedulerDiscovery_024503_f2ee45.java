for (var job : cloudSchedulerClient.listJobs(parent.toString()).iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, job.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withRegion(location).withConfiguration(GCPUtils.asJsonNode(job)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":job"), data.toJsonNode()));
}