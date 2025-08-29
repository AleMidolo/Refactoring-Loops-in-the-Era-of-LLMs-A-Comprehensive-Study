for (Dataset parent : failedSet.getParents()) {
    for (Dataset sibling : parent.getSubSets()) {
        if (sibling.equals(failedSet)) {
            continue;
        }
        createFallbackGeneratorForFirstAtomicSubsetOf(sibling);
        if (fallbackGenerator != null) {
            break;
        }
    }
}