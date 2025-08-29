IntStream.range(0, count)
         .forEach(i -> changes[i] = History.readOneChange(reader, pool));