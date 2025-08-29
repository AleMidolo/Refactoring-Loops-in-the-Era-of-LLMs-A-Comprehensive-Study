IntStream.range(0, n)
    .forEach(i -> sampleCount[g.generate(new ProductWrapper<>()).unwrap()]++);