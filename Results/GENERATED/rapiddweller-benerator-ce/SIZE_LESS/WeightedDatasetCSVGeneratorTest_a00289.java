IntStream.range(0, 1000)
    .anyMatch(i -> "Müller".equals(generator.generate()));