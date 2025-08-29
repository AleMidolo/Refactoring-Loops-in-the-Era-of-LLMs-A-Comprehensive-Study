IntStream.range(0, size)
    .mapToObj(i -> generateFromSource())
    .takeWhile(Objects::nonNull)
    .map(ProductWrapper::unwrap)
    .forEach(collection::add);