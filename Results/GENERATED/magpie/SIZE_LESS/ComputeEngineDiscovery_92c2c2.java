p.iterateAll().stream()
    .map(disk -> {
        String assetId = diskSelfLinkToAssetId(disk.getSelfLink());
        return new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, assetId)
                .withResourceId(assetId)
                .withResourceName(disk.getName())
                .withProjectId(projectId)
                .withResourceType(RESOURCE_TYPE)
                .withRegion(zone.getName())
                .withConfiguration(GCPUtils.asJsonNode(disk))
                .build();
    })
    .forEach(data -> emitter.emit(create(session, List.of(fullService() + ":disk"), data.toJsonNode()));