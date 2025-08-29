for (WeightedSample<E> sample : samples) {
    awSource.addSample(sample.getValue(), sample.getWeight());
}