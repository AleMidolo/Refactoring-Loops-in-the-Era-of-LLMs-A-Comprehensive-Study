for (var sqlInstance : response.getItems()) {
    final var assetId = GCPUtils.selfLinkToAssetId(sqlInstance.getSelfLink());
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, assetId).withResourceName(sqlInstance.getName()).withResourceId(assetId).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withRegion(sqlInstance.getRegion()).withConfiguration(GCPUtils.asJsonNode(sqlInstance)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":sqlInstance"), data.toJsonNode()));
}