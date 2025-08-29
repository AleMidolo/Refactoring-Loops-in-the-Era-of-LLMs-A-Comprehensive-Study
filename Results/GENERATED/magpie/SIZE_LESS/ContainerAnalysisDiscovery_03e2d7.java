client.listNotes(ProjectName.of(projectId).toString(), "").iterateAll()
    .stream()
    .map(note -> new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, note.getName())
            .withProjectId(projectId)
            .withResourceType(RESOURCE_TYPE)
            .withConfiguration(GCPUtils.asJsonNode(note))
            .build())
    .forEach(data -> emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":note"), data.toJsonNode()));