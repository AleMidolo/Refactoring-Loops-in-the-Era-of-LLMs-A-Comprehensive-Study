Arrays.stream(partCounts)
    .mapToObj(partCount -> {
        Generator<String>[] sources = new Generator[partCount];
        IntStream.range(0, partCount)
                .forEach(i -> sources[i] = WrapperFactory.asStringGenerator(partGeneratorProvider.create()));
        return new CompositeStringGenerator(true, sources);
    })
    .forEach(result::addSource);