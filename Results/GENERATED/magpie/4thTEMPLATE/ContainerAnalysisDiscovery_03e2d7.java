client.listNotes(ProjectName.of(projectId).toString(), "").iterateAll().forEach(note -> {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, note.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(note)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":note"), data.toJsonNode()));
});