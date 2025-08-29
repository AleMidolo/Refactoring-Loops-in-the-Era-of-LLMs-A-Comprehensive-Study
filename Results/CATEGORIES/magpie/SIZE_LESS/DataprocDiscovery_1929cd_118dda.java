for (var job : client.listJobs(projectId, location).iterateAll()) {
    String assetId = String.format("%s::%s", RESOURCE_TYPE, job.getReference().getJobId());
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, assetId).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withRegion(location).withConfiguration(GCPUtils.asJsonNode(job)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":job"), data.toJsonNode()));
}