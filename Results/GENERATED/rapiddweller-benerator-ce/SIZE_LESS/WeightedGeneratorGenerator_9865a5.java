IntStream.range(0, sourceWeights.size())
    .forEach(i -> indexGenerator.addSample(i, sourceWeights.get(i)));