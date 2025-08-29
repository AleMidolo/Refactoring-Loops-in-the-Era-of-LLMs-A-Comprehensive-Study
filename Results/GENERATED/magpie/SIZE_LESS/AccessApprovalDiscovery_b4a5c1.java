accessApprovalAdminClient.listApprovalRequests(ProjectName.of(projectId).toString()).iterateAll()
.stream()
.map(approvalRequest -> new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, approvalRequest.getName())
.withProjectId(projectId)
.withResourceType(RESOURCE_TYPE)
.withConfiguration(GCPUtils.asJsonNode(approvalRequest))
.build())
.forEach(data -> emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":approvalRequest"), data.toJsonNode()));