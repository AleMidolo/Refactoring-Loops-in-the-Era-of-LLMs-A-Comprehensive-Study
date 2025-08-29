set.getSubSets().stream()
    .filter(subset -> subset.isAtomic())
    .findFirst()
    .ifPresent(subset -> {
        createFallbackGeneratorForFirstAtomicSubsetOf(subset);
        if (fallbackGenerator != null) {
            return;
        }
    });