subSets.stream()
    .forEach(subSet -> {
        if (subSet.getSubSets().isEmpty()) {
            atomicSubSets.add(subSet);
        } else {
            atomicSubSets.addAll(subSet.allAtomicSubSets());
        }
    });