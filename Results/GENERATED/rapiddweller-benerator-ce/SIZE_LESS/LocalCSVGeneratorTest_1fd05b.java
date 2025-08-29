IntStream.range(0, 10)
    .mapToObj(i -> GeneratorUtil.generateNonNull(deGen))
    .forEach(name -> assertTrue(deNames.contains(name)));