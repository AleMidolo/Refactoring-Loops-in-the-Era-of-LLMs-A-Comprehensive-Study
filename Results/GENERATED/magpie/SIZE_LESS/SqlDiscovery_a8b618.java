response.getItems().stream()
    .map(sqlInstance -> {
        String assetId = GCPUtils.selfLinkToAssetId(sqlInstance.getSelfLink());
        MagpieGcpResource data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, assetId)
            .withResourceName(sqlInstance.getName())
            .withResourceId(assetId)
            .withProjectId(projectId)
            .withResourceType(RESOURCE_TYPE)
            .withRegion(sqlInstance.getRegion())
            .withConfiguration(GCPUtils.asJsonNode(sqlInstance))
            .build();
        return VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":sqlInstance"), data.toJsonNode());
    })
    .forEach(emitter::emit);