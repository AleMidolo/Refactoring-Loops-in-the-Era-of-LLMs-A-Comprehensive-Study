IntStream.range(0, n)
    .forEach(i -> sampleCount[GeneratorUtil.generateNonNull(generator)]++);