IntStream.range(0, sources.length)
         .mapToObj(i -> asStringGenerator(sources[i]))
         .toArray(String[]::new);