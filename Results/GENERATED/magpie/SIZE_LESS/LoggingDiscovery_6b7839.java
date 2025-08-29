configClient.listExclusions(parent).iterateAll().stream()
        .map(exclusion -> new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, exclusion.getName())
                .withProjectId(projectId)
                .withResourceType(RESOURCE_TYPE)
                .withConfiguration(GCPUtils.asJsonNode(exclusion))
                .build())
        .forEach(data -> emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":exclusion"), data.toJsonNode()));