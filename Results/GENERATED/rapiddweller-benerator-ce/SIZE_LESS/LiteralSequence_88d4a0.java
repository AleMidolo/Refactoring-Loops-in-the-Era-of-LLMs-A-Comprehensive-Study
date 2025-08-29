Arrays.stream(samples)
      .map(sample -> (Number) sample.getValue())
      .toArray(Number[]::new);