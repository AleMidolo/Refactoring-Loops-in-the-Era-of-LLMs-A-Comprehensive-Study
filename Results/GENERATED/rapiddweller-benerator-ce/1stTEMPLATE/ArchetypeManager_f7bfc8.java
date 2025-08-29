return archetypes.stream()
    .filter(candidate -> "simple".equals(candidate.getId()))
    .findFirst()
    .orElse(null);