client.searchProjects("").iterateAll().stream()
    .map(project -> new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, project.getName())
            .withProjectId(projectId).withResourceType(RESOURCE_TYPE)
            .withConfiguration(GCPUtils.asJsonNode(project)).build())
    .forEach(data -> {
        discoverProjectIamPolicy(client, project, data);
        emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":project"), data.toJsonNode()));
    });