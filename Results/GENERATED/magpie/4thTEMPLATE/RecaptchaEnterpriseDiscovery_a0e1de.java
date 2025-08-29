recaptchaEnterpriseServiceClient.listKeys(request).iterateAll().stream()
        .map(key -> new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, key.getName())
                .withProjectId(projectId)
                .withResourceType(RESOURCE_TYPE)
                .withConfiguration(GCPUtils.asJsonNode(key))
                .build())
        .forEach(data -> emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":key"), data.toJsonNode()));