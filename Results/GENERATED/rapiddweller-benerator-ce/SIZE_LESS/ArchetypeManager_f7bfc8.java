return archetypes.stream()
        .filter(candidate -> "simple".equals(candidate.getId()))
        .findAny()
        .orElse(null);