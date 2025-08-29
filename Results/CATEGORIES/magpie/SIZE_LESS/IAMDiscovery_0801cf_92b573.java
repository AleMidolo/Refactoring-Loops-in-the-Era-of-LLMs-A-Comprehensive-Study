for (int i = 1; i < reportLines.length; i++) {
    var credential = new IAMCredential(reportLines[i]);
    final var synthetic_arn = credential.arn.concat(CREDENTIALS_REPORT);
    var data = new MagpieAwsResource.MagpieAwsResourceBuilder(mapper, synthetic_arn).withResourceName(credential.user).withResourceId(synthetic_arn).withResourceType(RESOURCE_TYPE).withConfiguration(mapper.valueToTree(credential)).withAccountId(account).withAwsRegion(region.toString()).build();
    emitter.emit(VersionedMagpieEnvelopeProvider.create(session, List.of(fullService() + ":credentialsReport"), data.toJsonNode()));
}