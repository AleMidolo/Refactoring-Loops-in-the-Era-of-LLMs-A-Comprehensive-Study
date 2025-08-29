boolean result = Arrays.stream(a)
    .anyMatch(v -> testValue(v));