IntStream.range(delta, size())
         .forEach(i -> set(i, get(i - delta)));