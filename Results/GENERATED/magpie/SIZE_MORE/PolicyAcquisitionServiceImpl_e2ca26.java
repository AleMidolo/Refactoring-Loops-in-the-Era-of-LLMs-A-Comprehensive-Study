Files.requireNonNull(policiesDirectory.listFiles())
    .stream()
    .map(policyFile -> loadPolicy(policyFile))
    .filter(Objects::nonNull)
    .map(policy -> {
        List<String> policyRulesFiles = new ArrayList<>(policy.getRuleIds());
        policy.setRules(loadRules(rulesDirectory.toString(), policyRulesFiles));
        PolicyMetadata policyMetadata = new PolicyMetadata(policy.getPath(), getRepoHashOrLocalRepositoryString(repositoryPath));
        return new PolicyContext(policyMetadata, policy);
    })
    .forEach(policiesContexts::add);