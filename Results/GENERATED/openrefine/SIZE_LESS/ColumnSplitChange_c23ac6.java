IntStream.range(0, count)
    .mapToObj(i -> reader.readLine())
    .filter(Objects::nonNull)
    .forEach(columnNames::add);