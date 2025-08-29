for (var occurrence : client.listOccurrences(ProjectName.of(projectId).toString(), "").iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, occurrence.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(occurrence)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":occurrence"), data.toJsonNode()));
}