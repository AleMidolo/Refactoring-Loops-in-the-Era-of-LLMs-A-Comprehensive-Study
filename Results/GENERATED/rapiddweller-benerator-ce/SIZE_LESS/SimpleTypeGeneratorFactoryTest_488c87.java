IntStream.range(0, 2)
    .forEach(i -> counter.count(GeneratorUtil.generateNonNull(generator)));