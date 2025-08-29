for (var dataset : dataLabelingServiceClient.listDatasets(ProjectName.of(projectId).toString(), "").iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, dataset.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(dataset)).build();
    discoverAnnotatedDatasets(dataLabelingServiceClient, dataset, data);
    discoverDataItems(dataLabelingServiceClient, dataset, data);
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":dataset"), data.toJsonNode()));
}