client.searchFolders("").iterateAll().forEach(folder -> {
    MagpieGcpResource data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, folder.getName())
            .withProjectId(projectId)
            .withResourceType(RESOURCE_TYPE)
            .withConfiguration(GCPUtils.asJsonNode(folder))
            .build();
    discoverFolderIamPolicy(client, folder, data);
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":folder"), data.toJsonNode()));
});