for (int i = 0; i < tokenCount; i++) {
    sources[i] = new NonNullSampleGenerator<>(String.class);
    sources[i].setUnique(unique);
}