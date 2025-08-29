for (Instance instance : p.iterateAll()) {
    logger.debug("Discovered instance={}", instance.getSelfLink());
    String assetId = instanceSelfLinkToAssetId(instance.getSelfLink());
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, assetId).withResourceId(assetId).withResourceName(instance.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withRegion(zone.getName()).withConfiguration(GCPUtils.asJsonNode(instance)).build();
    emitter.emit(create(session, List.of(fullService() + ":instance"), data.toJsonNode()));
}