weightedSamples.stream()
                .map(WeightedSample::getValue)
                .forEach(result::add);