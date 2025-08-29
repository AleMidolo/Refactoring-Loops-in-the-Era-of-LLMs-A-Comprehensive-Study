client.listClusters(projectId, location).iterateAll().stream()
        .map(cluster -> {
            String assetId = String.format("%s::%s", RESOURCE_TYPE, cluster.getClusterName());
            return new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, assetId)
                    .withProjectId(projectId)
                    .withResourceType(RESOURCE_TYPE)
                    .withRegion(location)
                    .withConfiguration(GCPUtils.asJsonNode(cluster))
                    .build();
        })
        .forEach(data -> emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":cluster"), data.toJsonNode()));