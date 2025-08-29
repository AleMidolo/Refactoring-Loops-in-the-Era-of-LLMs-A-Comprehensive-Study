IntStream.range(0, n)
         .mapToObj(i -> g.generate().intValue())
         .forEach(sample -> sampleCount[sample - min]++);