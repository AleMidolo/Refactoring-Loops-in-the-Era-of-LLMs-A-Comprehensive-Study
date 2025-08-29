client.listPatchDeployments(ProjectName.of(projectId)).iterateAll().stream()
    .map(patchDeployment -> 
        new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, patchDeployment.getName())
            .withProjectId(projectId)
            .withResourceType(RESOURCE_TYPE)
            .withConfiguration(GCPUtils.asJsonNode(patchDeployment))
            .build())
    .forEach(data -> 
        emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":patchDeployment"), data.toJsonNode()));