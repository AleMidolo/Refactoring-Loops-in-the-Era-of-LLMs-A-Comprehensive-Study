IntStream.range(0, N)
    .mapToObj(i -> GeneratorUtil.generateNullable(generator))
    .filter(title -> title.length() > 0)
    .peek(title -> assertTrue(expectedTitles.contains(title)))
    .forEach(title -> nobCount++);