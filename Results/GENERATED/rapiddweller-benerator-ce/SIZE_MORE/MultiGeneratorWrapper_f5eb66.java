IntStream.range(0, sources.size())
    .mapToObj(i -> sources.get(i).generate(elementWrapper))
    .takeWhile(Objects::nonNull)
    .map(elementWrapper::unwrap)
    .map(product -> (S) product)
    .toArray(size -> new S[size]);