IntStream.range(0, fieldLengths.length)
         .filter(i -> fieldLengths[i] < 0)
         .forEach(i -> fieldLengths[i] = 0);