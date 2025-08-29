IntStream.range(0, count)
    .mapToObj(i -> reader.readLine())
    .takeWhile(Objects::nonNull)
    .map(line -> Row.load(line, pool))
    .forEach(oldRows::add);