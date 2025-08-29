for (var annotationSpecSet : dataLabelingServiceClient.listAnnotationSpecSets(ProjectName.of(projectId).toString(), "").iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, annotationSpecSet.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(annotationSpecSet)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":annotationSpecSet"), data.toJsonNode()));
}