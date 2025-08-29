for (WeightedSample<T> sample : samples) {
    if (sample.getValue() == null) {
        throw BeneratorExceptionFactory.getInstance().configurationError("null is not supported in values='...', drop it from the list and use a nullQuota instead");
    }
    generator.addSample(sample.getValue(), sample.getWeight());
}