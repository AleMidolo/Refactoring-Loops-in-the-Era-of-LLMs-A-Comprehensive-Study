IntStream.range(0, tokenCount)
    .forEach(i -> {
        sources[i] = new NonNullSampleGenerator<>(String.class);
        sources[i].setUnique(unique);
    });