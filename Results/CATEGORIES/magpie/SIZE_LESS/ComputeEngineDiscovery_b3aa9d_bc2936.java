for (Disk disk : p.iterateAll()) {
    String assetId = diskSelfLinkToAssetId(disk.getSelfLink());
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, assetId).withResourceId(assetId).withResourceName(disk.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withRegion(zone.getName()).withConfiguration(GCPUtils.asJsonNode(disk)).build();
    emitter.emit(create(session, List.of(fullService() + ":disk"), data.toJsonNode()));
}