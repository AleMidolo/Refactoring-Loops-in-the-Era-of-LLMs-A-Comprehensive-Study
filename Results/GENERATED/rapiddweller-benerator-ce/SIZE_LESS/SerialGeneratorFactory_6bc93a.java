IntStream.rangeClosed(minCount, maxCount)
         .filter(i -> (i - minCount) % countPrecision == 0)
         .forEach(result::add);