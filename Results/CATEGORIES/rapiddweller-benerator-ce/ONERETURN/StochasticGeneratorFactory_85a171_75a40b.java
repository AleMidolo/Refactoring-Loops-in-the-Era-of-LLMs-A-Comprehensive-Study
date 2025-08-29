for (WeightedSample<?> sample : samples) {
    if (sample.getWeight() != 1) {
        return true;
    }
}