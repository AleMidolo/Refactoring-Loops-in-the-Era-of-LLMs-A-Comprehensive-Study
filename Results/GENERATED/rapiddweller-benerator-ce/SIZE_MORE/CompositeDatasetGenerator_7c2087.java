failedSet.getParents().stream()
    .flatMap(parent -> parent.getSubSets().stream())
    .filter(sibling -> !sibling.equals(failedSet))
    .findFirst()
    .ifPresent(sibling -> {
        createFallbackGeneratorForFirstAtomicSubsetOf(sibling);
    });