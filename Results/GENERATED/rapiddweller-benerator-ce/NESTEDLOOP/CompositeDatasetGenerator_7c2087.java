failedSet.getParents().stream()
    .flatMap(parent -> parent.getSubSets().stream())
    .filter(sibling -> !sibling.equals(failedSet))
    .forEach(sibling -> {
        createFallbackGeneratorForFirstAtomicSubsetOf(sibling);
        if (fallbackGenerator != null) {
            return;
        }
    });