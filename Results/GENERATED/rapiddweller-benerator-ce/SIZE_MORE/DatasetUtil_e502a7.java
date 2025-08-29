dataset.allAtomicSubSets().stream()
    .map(atomicSet -> MessageFormat.format(filenamePattern, atomicSet))
    .filter(filename -> IOUtil.isURIAvailable(filename))
    .forEach(filename -> builder.add(filename));