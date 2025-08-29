IntStream.range(0, partCounts.length)
        .mapToObj(i -> {
            Generator<String>[] sources = new Generator[partCounts[i]];
            return IntStream.range(0, partCounts[i])
                    .mapToObj(j -> WrapperFactory.asStringGenerator(partGeneratorProvider.create()))
                    .toArray(Generator[]::new);
        })
        .map(sources -> new CompositeStringGenerator(true, sources))
        .forEach(result::addSource);