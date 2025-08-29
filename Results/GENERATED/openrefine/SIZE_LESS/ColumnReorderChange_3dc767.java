IntStream.range(0, count)
    .mapToObj(i -> reader.readLine())
    .filter(line -> line != null)
    .forEach(columnNames::add);