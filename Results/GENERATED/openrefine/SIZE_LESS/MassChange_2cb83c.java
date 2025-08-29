IntStream.range(0, changeCount)
    .mapToObj(i -> History.readOneChange(reader, pool))
    .forEach(changes::add);