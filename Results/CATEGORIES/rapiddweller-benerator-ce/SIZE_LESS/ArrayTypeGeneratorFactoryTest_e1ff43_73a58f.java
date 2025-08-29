for (int i = 0; i < 4; i++) {
    Object[] product = GeneratorUtil.generateNonNull(generator);
    assertTrue(Arrays.equals(INT13, product) || Arrays.equals(INT14, product) || Arrays.equals(INT23, product) || Arrays.equals(INT24, product));
}