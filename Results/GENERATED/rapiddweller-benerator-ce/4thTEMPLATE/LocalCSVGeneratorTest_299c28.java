IntStream.range(0, 10)
    .mapToObj(i -> GeneratorUtil.generateNonNull(enGen))
    .forEach(name -> assertTrue(enNames.contains(name));