recaptchaEnterpriseServiceClient.listKeys(request).iterateAll().forEach(key -> {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, key.getName())
                 .withProjectId(projectId)
                 .withResourceType(RESOURCE_TYPE)
                 .withConfiguration(GCPUtils.asJsonNode(key))
                 .build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":key"), data.toJsonNode()));
});