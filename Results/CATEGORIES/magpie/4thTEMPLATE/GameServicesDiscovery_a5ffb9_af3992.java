for (var realm : realmsServiceClient.listRealms(formattedParent).iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, realm.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(realm)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":realm"), data.toJsonNode()));
}