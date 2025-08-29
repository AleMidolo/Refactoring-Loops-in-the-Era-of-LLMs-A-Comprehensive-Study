for (var element : assetServiceClient.listFeeds(ProjectName.of(projectId).toString()).getFeedsList()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, element.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(element)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":feed"), data.toJsonNode()));
}