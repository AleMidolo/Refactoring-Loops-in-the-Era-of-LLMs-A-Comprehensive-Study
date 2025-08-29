client.listCapacityCommitments(parent)
      .iterateAll()
      .forEach(capacityCommitment -> {
          MagpieGcpResource data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, capacityCommitment.getName())
                  .withProjectId(projectId)
                  .withResourceType(RESOURCE_TYPE)
                  .withRegion(location)
                  .withConfiguration(GCPUtils.asJsonNode(capacityCommitment))
                  .build();
          emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":capacityCommitment"), data.toJsonNode()));
      });