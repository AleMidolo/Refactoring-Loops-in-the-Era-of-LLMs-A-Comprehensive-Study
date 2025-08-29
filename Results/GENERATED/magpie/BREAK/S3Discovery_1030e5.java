hasBucketEncryptionKeyEnabled = rules.stream()
        .anyMatch(ServerSideEncryptionRule::bucketKeyEnabled);