for (int i = 0; i < partCount; i++) {
    sources[i] = WrapperFactory.asStringGenerator(partGeneratorProvider.create());
}