boolean isNotAuthorized = !Arrays.stream(secrets)
        .anyMatch(secret -> encoder.matches(decodedValues[1], secret));