for (var patchJob : client.listPatchJobs(ProjectName.of(projectId)).iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, patchJob.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(patchJob)).build();
    discoverPatchJobInstanceDetails(client, patchJob, data);
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":patchJob"), data.toJsonNode()));
}