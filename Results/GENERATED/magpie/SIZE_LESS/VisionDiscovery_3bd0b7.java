productSearchClient.listProducts(parent).iterateAll().forEach(product -> {
    MagpieGcpResource data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, product.getName())
        .withProjectId(projectId)
        .withResourceType(RESOURCE_TYPE)
        .withRegion(location)
        .withConfiguration(GCPUtils.asJsonNode(product))
        .build();
    
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":product"), data.toJsonNode()));
});