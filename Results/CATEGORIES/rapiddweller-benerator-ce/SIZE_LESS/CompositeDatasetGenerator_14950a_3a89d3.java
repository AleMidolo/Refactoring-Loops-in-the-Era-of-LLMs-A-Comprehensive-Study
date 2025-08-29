for (Dataset subset : set.getSubSets()) {
    createFallbackGeneratorForFirstAtomicSubsetOf(subset);
    if (fallbackGenerator != null) {
        return;
    }
}