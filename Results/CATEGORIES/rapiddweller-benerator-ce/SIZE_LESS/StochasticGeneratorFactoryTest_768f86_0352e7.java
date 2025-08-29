for (int i = 0; i < n; i++) {
    WeightedSample<Integer> sample = new WeightedSample<>(i, i * 2. / (n * (n + 1)));
    samples.add(sample);
}