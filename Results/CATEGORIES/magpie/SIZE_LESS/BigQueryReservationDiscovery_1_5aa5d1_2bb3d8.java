for (var reservation : client.listReservations(parent).iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, reservation.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withRegion(location).withConfiguration(GCPUtils.asJsonNode(reservation)).build();
    discoverAssignments(client, reservation, data);
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":reservation"), data.toJsonNode()));
}