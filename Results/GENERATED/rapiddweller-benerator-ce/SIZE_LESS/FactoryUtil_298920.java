samples.stream()
        .map(WeightedSample::getValue)
        .forEach(values::add);