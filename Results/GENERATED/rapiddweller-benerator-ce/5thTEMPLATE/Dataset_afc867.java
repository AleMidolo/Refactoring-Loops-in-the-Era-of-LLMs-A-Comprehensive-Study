subSets.stream()
        .filter(subSet -> subSet.getSubSets().isEmpty())
        .forEach(atomicSubSets::add);

subSets.stream()
        .filter(subSet -> !subSet.getSubSets().isEmpty())
        .map(Dataset::allAtomicSubSets)
        .forEach(atomicSubSets::addAll);