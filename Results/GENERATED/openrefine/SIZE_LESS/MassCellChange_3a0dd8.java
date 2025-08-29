IntStream.range(0, cellChangeCount)
    .forEach(i -> cellChanges[i] = CellChange.load(reader, pool));