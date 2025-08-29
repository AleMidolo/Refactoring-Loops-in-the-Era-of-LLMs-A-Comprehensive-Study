IntStream.range(0, sampleCount)
    .forEach(i -> {
        value[i] = min + i * dx;
        sum += function.value(value[i]);
        probSum[i] = sum;
    });