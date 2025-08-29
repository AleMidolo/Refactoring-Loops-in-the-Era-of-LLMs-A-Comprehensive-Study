IntStream.range(0, 2).forEach(i -> {
    Object[] product = GeneratorUtil.generateNonNull(generator);
    assertTrue("Found: " + ArrayFormat.format(product), Arrays.equals(ALICE, product) || Arrays.equals(BOB, product));
});