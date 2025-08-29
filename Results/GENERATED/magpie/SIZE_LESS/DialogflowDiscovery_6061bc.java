conversationsClient.listConversations(ProjectName.of(projectId)).iterateAll().forEach(conversation -> {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, conversation.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(conversation)).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":conversation"), data.toJsonNode()));
});