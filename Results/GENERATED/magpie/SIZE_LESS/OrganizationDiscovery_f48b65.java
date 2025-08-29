listPoliciesIterable.stream()
    .flatMap(listPoliciesResponse -> listPoliciesResponse.policies().stream())
    .forEach(policySummary -> {
        DescribePolicyRequest describePolicyRequest = DescribePolicyRequest.builder().policyId(policySummary.id()).build();
        DescribePolicyResponse describePolicyResponse = client.describePolicy(describePolicyRequest);
        Policy policy = describePolicyResponse.policy();
        var data = new MagpieAwsResource.MagpieAwsResourceBuilder(mapper, policySummary.arn())
            .withResourceName(policySummary.name())
            .withResourceId(policySummary.id())
            .withResourceType(RESOURCE_TYPE)
            .withConfiguration(PayloadUtils.update(policySummary))
            .withSupplementaryConfiguration(AWSUtils.parsePolicyDocument(mapper, policy.content()))
            .withAccountId(account)
            .withAwsRegion(region.id())
            .build();
        emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":policy"), data.toJsonNode()));
    });