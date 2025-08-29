IntStream.range(0, n)
    .mapToObj(i -> GeneratorUtil.generateNonNull(generator))
    .forEach(counter::count);