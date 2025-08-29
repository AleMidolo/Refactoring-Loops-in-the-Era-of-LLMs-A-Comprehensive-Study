set.getSubSets().stream()
    .filter(subset -> subset instanceof AtomicSubset)
    .map(subset -> (AtomicSubset) subset)
    .findFirst()
    .ifPresent(this::createFallbackGeneratorForFirstAtomicSubsetOf);