IntFunction<Float> weightExtractor = i -> {
    double weight = samples[i].getWeight();
    if (weight < 0) {
        throw BeneratorExceptionFactory.getInstance().illegalArgument("Negative weight in literal: " + literal);
    }
    sum += weight;
    return (float) sum;
};

IntStream.range(0, sampleCount)
        .mapToObj(weightExtractor)
        .toArray(Float[]::new);