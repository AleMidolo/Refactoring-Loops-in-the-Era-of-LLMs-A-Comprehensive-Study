IntStream.range(0, partCount)
    .forEach(i -> sources[i] = WrapperFactory.asStringGenerator(partGeneratorProvider.create()));