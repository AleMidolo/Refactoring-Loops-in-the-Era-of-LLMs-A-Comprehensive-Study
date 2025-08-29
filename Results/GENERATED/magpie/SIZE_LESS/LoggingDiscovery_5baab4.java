configClient.listBuckets(parent).iterateAll().stream()
    .map(bucket -> new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, bucket.getName())
                    .withProjectId(projectId)
                    .withResourceType(RESOURCE_TYPE)
                    .withConfiguration(GCPUtils.asJsonNode(bucket))
                    .build())
    .forEach(data -> emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":bucket"), data.toJsonNode()));