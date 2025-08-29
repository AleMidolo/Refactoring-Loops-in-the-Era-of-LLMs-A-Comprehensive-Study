for (int partCount = minParts; partCount <= maxParts; partCount++) {
    if (partCount == 0) {
        result.addSource(new ConstantGenerator<>(""));
    } else {
        Generator<String>[] sources = new Generator[partCount];
        for (int i = 0; i < partCount; i++) {
            sources[i] = WrapperFactory.asStringGenerator(partGeneratorProvider.create());
        }
        result.addSource(new CompositeStringGenerator(uniqueness.isUnique(), sources));
    }
}