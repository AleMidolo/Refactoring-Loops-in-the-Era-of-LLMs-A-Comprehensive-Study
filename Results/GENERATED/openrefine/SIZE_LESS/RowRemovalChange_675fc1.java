IntStream.range(0, count)
    .mapToObj(i -> reader.readLine())
    .filter(Objects::nonNull)
    .map(Integer::parseInt)
    .forEach(rowIndices::add);