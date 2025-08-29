IntStream.range(minParts, maxParts + 1).forEach(partCount -> {
    if (partCount == 0) {
        result.addSource(new ConstantGenerator<>(""));
    } else {
        Generator<String>[] sources = IntStream.range(0, partCount)
                                                .mapToObj(i -> WrapperFactory.asStringGenerator(partGeneratorProvider.create()))
                                                .toArray(Generator[]::new);
        result.addSource(new CompositeStringGenerator(uniqueness.isUnique(), sources));
    }
});