IntStream.range(0, count)
    .mapToObj(i -> reader.readLine())
    .takeWhile(Objects::nonNull)
    .map(Column::load)
    .forEach(oldColumns::add);