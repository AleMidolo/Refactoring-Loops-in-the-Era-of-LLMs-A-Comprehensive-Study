productSearchClient.listProductSets(parent).iterateAll().stream()
    .map(product -> new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, product.getName())
            .withProjectId(projectId)
            .withResourceType(RESOURCE_TYPE)
            .withRegion(location)
            .withConfiguration(GCPUtils.asJsonNode(product))
            .build())
    .forEach(data -> emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":productSet"), data.toJsonNode()));