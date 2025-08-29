assetServiceClient.listFeeds(ProjectName.of(projectId).toString()).getFeedsList().stream()
    .map(element -> new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, element.getName())
            .withProjectId(projectId).withResourceType(RESOURCE_TYPE)
            .withConfiguration(GCPUtils.asJsonNode(element)).build())
    .forEach(data -> emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":feed"), data.toJsonNode()));