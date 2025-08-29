IntStream.range(0, count)
    .mapToObj(i -> reader.readLine())
    .filter(line -> line != null)
    .map(line -> Row.load(line, pool))
    .forEach(newRows::add);