for (Dataset subSet : subSets) {
    if (subSet.getSubSets().isEmpty()) {
        atomicSubSets.add(subSet);
    } else {
        atomicSubSets.addAll(subSet.allAtomicSubSets());
    }
}