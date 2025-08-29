for (var organization : client.searchOrganizations("").iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, organization.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(organization)).build();
    discoverOrganizationIamPolicy(client, organization, data);
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":organization"), data.toJsonNode()));
}