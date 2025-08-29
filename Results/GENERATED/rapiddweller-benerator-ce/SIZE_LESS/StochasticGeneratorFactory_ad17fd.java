Arrays.stream(samples)
      .map(sample -> ToStringConverter.convert(sample.getValue(), null))
      .toArray(String[]::new);