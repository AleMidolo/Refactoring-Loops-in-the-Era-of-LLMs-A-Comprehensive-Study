client.listTopics(ProjectName.of(projectId)).iterateAll().stream()
        .map(topic -> new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, topic.getName())
                .withProjectId(projectId)
                .withResourceType(RESOURCE_TYPE)
                .withConfiguration(GCPUtils.asJsonNode(topic))
                .build())
        .forEach(data -> emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":topic"), data.toJsonNode()));