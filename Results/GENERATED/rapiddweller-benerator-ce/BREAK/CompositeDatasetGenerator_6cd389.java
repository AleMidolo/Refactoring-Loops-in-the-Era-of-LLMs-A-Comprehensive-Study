parent.getSubSets().stream()
    .filter(sibling -> !sibling.equals(failedSet))
    .peek(this::createFallbackGeneratorForFirstAtomicSubsetOf)
    .filter(sibling -> fallbackGenerator != null)
    .findFirst();