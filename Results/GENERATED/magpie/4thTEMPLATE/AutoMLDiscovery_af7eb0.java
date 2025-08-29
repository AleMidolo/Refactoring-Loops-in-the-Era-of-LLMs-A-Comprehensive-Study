client.listModels(parent).iterateAll().stream()
    .map(element -> new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, element.getName())
                    .withProjectId(projectId)
                    .withResourceType(RESOURCE_TYPE)
                    .withRegion(location)
                    .withConfiguration(GCPUtils.asJsonNode(element))
                    .build())
    .map(data -> VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":model"), data.toJsonNode()))
    .forEach(emitter::emit);