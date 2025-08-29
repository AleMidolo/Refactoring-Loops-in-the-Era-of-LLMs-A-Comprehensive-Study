for (var cluster : client.listClusters(projectId, location).iterateAll()) {
    String assetId = String.format("%s::%s", RESOURCE_TYPE, cluster.getClusterName());
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, assetId).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withRegion(location).withConfiguration(GCPUtils.asJsonNode(cluster)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":cluster"), data.toJsonNode()));
}