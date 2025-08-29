IntStream.range(0, n)
    .mapToObj(i -> new WeightedSample<>(i, i * 2. / (n * (n + 1))))
    .forEach(samples::add);