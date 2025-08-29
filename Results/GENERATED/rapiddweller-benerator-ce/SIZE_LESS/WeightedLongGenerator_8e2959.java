IntStream.range(0, sampleCount)
    .mapToLong(i -> (max - min) / (sampleCount - 1) * i + min)
    .mapToDouble(function::value)
    .mapToDouble(Double::valueOf)
    .reduce(Double::sum)
    .ifPresent(sum -> IntStream.range(0, sampleCount)
        .forEach(i -> probSum[i] = (float) sum);