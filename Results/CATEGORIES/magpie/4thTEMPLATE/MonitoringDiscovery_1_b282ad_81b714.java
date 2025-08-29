for (AlertPolicy alertPolicy : alertPolicyServiceClient.listAlertPolicies(ProjectName.of(projectId)).iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, alertPolicy.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(alertPolicy)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":alertPolicy"), data.toJsonNode()));
}