for (File policyFile : Objects.requireNonNull(policiesDirectory.listFiles())) {
    var policy = loadPolicy(policyFile);
    if (policy != null) {
        var policyRulesFiles = new ArrayList<>(policy.getRuleIds());
        policy.setRules(loadRules(rulesDirectory.toString(), policyRulesFiles));
        var policyMetadata = new PolicyMetadata(policyFile.getPath(), getRepoHashOrLocalRepositoryString(repositoryPath));
        policiesContexts.add(new PolicyContext(policyMetadata, policy));
    }
}