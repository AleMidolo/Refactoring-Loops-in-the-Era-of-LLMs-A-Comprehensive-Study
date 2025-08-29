dataLabelingServiceClient.listAnnotationSpecSets(ProjectName.of(projectId).toString(), "").iterateAll().forEach(annotationSpecSet -> {
    MagpieGcpResource.MagpieGcpResourceBuilder resourceBuilder = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, annotationSpecSet.getName())
            .withProjectId(projectId)
            .withResourceType(RESOURCE_TYPE)
            .withConfiguration(GCPUtils.asJsonNode(annotationSpecSet));
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":annotationSpecSet"), resourceBuilder.build().toJsonNode()));
});