for (WeightedSample<E> sample : samples) {
    generator.addSample(sample.getValue(), sample.getWeight());
}