for (var instruction : dataLabelingServiceClient.listInstructions(ProjectName.of(projectId).toString(), "").iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, instruction.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(instruction)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":instruction"), data.toJsonNode()));
}