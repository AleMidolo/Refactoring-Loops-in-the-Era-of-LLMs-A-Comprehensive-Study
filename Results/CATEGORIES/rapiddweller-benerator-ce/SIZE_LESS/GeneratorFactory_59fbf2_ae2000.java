for (WeightedSample<T> sample : samples) {
    generator.addSample(sample.getValue(), sample.getWeight());
}