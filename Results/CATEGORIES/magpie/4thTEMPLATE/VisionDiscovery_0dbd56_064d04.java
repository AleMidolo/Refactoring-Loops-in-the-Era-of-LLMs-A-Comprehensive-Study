for (var product : productSearchClient.listProductSets(parent).iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, product.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withRegion(location).withConfiguration(GCPUtils.asJsonNode(product)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":productSet"), data.toJsonNode()));
}