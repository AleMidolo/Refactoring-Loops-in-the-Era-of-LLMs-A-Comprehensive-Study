return samples.stream()
        .anyMatch(sample -> sample.getWeight() != 1);