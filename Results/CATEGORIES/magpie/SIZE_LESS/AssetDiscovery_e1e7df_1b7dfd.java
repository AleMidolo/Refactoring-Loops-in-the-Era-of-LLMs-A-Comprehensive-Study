for (var element : assetServiceClient.listAssets(ProjectName.of(projectId).toString()).iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, element.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(element)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":asset"), data.toJsonNode()));
}