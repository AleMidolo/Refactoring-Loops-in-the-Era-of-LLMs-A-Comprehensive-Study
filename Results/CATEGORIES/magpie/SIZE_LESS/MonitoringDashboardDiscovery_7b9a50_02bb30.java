for (var dashboard : dashboardsServiceClient.listDashboards(request).iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, dashboard.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(dashboard)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":dashboard"), data.toJsonNode()));
}