client.listReservations(parent).iterateAll().stream()
    .map(reservation -> new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, reservation.getName())
    .withProjectId(projectId)
    .withResourceType(RESOURCE_TYPE)
    .withRegion(location)
    .withConfiguration(GCPUtils.asJsonNode(reservation))
    .build())
    .forEach(data -> {
        discoverAssignments(client, reservation, data);
        emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":reservation"), data.toJsonNode()));
    });