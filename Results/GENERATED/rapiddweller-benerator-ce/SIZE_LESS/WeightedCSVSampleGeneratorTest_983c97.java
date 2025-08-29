IntStream.range(0, 10)
    .mapToObj(i -> GeneratorUtil.generateNonNull(generator))
    .forEach(generatedDate -> assertTrue("generated date not in expected value set: " + sdf.format(generatedDate), expectedDates.contains(generatedDate)));