client.listBillingAccounts().iterateAll().stream()
      .map(billingAccount -> new MagpieGcpResource.MagpieGcpResourceBuilder(mapper, billingAccount.getName()).withProjectId(projectId).withResourceType(RESOURCE_TYPE).withConfiguration(GCPUtils.asJsonNode(billingAccount)).build())
      .forEach(data -> {
          discoverProjectBillingInfo(client, billingAccount, data);
          emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":billingAccount"), data.toJsonNode()));
      });