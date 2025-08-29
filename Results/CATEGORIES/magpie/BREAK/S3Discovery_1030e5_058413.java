for (ServerSideEncryptionRule rule : rules) {
    if (rule.bucketKeyEnabled()) {
        hasBucketEncryptionKeyEnabled = true;
        break;
    }
}