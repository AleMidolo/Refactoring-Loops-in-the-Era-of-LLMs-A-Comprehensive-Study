values.stream()
      .forEach(value -> assertTrue(samples.getCount(value) > 0));