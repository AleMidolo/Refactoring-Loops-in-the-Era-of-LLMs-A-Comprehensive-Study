IntStream.range(0, 10)
    .forEach(i -> assertNull(GeneratorUtil.generateNullable(helper)));