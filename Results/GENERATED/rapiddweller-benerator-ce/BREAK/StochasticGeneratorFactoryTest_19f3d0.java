IntStream.range(0, 30)
    .mapToObj(i -> generator.generate(wrapper))
    .takeWhile(Objects::nonNull)
    .map(Wrapper::unwrap)
    .peek(n -> assertNotNull("Generator not available: " + generator, n))
    .filter(n -> min == null || n.doubleValue() >= min.doubleValue())
    .filter(n -> max == null || n.doubleValue() <= max.doubleValue())
    .forEach(n -> {});