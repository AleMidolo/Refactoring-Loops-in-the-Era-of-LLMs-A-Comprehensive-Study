for (int partCount : partCounts) {
    Generator<String>[] sources = new Generator[partCount];
    for (int i = 0; i < partCount; i++) {
        sources[i] = WrapperFactory.asStringGenerator(partGeneratorProvider.create());
    }
    result.addSource(new CompositeStringGenerator(true, sources));
}