client.listSchemas(ProjectName.of(projectId)).iterateAll().forEach(schema -> {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, schema.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(schema)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":schema"), data.toJsonNode()));
});