IntStream.iterate(0, i -> size == null || i < size, i -> i + 1)
    .mapToObj(i -> generateFromSource())
    .takeWhile(Objects::nonNull)
    .map(ProductWrapper::unwrap)
    .forEach(collection::add);