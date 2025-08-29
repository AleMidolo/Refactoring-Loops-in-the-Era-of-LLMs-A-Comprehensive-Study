for (Dataset atomicSet : dataset.allAtomicSubSets()) {
    String filename = MessageFormat.format(filenamePattern, atomicSet);
    if (IOUtil.isURIAvailable(filename)) {
        builder.add(filename);
    } else {
        logger.warn("Data file not found: {}", filename);
    }
}