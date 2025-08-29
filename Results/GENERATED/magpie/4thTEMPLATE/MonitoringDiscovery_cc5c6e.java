groupServiceClient.listGroups(ProjectName.of(projectId)).iterateAll().forEach(group -> {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, group.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(group)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":group"), data.toJsonNode()));
});