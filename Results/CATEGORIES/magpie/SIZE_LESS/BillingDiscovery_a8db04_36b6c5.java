for (var billingAccount : client.listBillingAccounts().iterateAll()) {
    var data = new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, billingAccount.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(billingAccount)).build();
    discoverProjectBillingInfo(client, billingAccount, data);
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":billingAccount"), data.toJsonNode()));
}