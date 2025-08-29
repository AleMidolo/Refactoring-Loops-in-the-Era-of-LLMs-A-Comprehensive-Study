IntStream.range(0, n)
    .mapToObj(i -> g.generate(new ProductWrapper<>()).unwrap())
    .forEach(val -> sampleCount[val]++);