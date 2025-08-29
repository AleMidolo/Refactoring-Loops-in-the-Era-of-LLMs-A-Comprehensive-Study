IntStream.range(0, 2)
    .mapToObj(i -> GeneratorUtil.generateNonNull(generator))
    .forEach(product -> assertTrue("Found: " + ArrayFormat.format(product), Arrays.equals(ALICE, product) || Arrays.equals(BOB, product));