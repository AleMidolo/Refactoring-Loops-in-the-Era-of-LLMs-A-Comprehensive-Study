for (var dataSource : client.listTransferConfigs(parent).iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, dataSource.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withRegion(location).withConfiguration(GCPUtils.asJsonNode(dataSource)).build();
    discoverTransferRuns(client, dataSource, data);
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":transferConfig"), data.toJsonNode()));
}