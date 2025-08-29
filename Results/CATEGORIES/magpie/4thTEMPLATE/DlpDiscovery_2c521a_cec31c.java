for (var jobTrigger : dlpServiceClient.listJobTriggers(ProjectName.of(projectId)).iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, jobTrigger.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(jobTrigger)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":jobTrigger"), data.toJsonNode()));
}