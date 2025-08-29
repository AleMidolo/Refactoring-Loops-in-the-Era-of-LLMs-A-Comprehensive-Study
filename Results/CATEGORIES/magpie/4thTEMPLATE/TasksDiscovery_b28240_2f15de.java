for (Queue element : cloudTasksClient.listQueues(parent.toString()).iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, element.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withRegion(location).withConfiguration(GCPUtils.asJsonNode(element)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":queue"), data.toJsonNode()));
}