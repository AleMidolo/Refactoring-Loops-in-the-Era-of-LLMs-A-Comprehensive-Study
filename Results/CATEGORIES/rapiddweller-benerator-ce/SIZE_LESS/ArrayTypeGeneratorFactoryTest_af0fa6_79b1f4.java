for (int i = 0; i < 2; i++) {
    Object[] product = GeneratorUtil.generateNonNull(generator);
    assertTrue("Found: " + ArrayFormat.format(product), Arrays.equals(ALICE, product) || Arrays.equals(BOB, product));
}