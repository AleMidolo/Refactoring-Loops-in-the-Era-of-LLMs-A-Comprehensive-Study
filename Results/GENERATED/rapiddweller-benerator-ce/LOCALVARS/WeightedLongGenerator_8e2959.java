IntStream.range(0, sampleCount)
         .mapToLong(i -> (max - min) / (sampleCount - 1) * i + min)
         .mapToDouble(function::value)
         .reduce((a, b) -> {
             double sum = a + b;
             probSum[index.getAndIncrement()] = (float) sum;
             return sum;
         })
         .orElse(0.0);