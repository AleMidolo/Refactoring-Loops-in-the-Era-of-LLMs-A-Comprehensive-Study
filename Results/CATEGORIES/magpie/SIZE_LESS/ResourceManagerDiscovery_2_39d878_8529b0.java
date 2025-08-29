for (var project : client.searchProjects("").iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, project.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(project)).build();
    discoverProjectIamPolicy(client, project, data);
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":project"), data.toJsonNode()));
}