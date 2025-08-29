
webSecurityScannerClient.listScanConfigs(request)
        .iterateAll()
        .forEach(element -> {
            var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, element.getName())
                    .withProjectId(projectId)
                    .withResourceType(RESOURCE_TYPE)
                    .withConfiguration(GCPUtils.asJsonNode(element))
                    .build();

            discoverScanRuns(webSecurityScannerClient, element, data);
            emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":scanConfig"), data.toJsonNode()));
        });