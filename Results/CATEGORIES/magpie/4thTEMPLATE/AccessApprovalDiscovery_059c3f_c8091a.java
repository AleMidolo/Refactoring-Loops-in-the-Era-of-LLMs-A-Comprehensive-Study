for (var approvalRequest : accessApprovalAdminClient.listApprovalRequests(ProjectName.of(projectId).toString()).iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, approvalRequest.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(approvalRequest)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":approvalRequest"), data.toJsonNode()));
}