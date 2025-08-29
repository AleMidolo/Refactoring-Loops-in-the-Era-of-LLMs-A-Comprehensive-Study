boolean isNotAuthorized = !Arrays.stream(secrets)
    .noneMatch(secret -> secret.equals(clientSecret));