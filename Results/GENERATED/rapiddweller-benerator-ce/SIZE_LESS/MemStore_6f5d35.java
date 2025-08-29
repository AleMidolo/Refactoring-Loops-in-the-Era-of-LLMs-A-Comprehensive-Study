int result = entitiesByType.values().stream()
    .map(EntityStore::size)
    .reduce(0, Integer::sum);