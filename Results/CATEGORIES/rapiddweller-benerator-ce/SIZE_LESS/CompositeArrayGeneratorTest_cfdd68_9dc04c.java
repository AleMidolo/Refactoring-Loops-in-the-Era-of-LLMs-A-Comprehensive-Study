for (int i = 0; i < 10; i++) {
    assertArrayEquals(EXPECTED_ARRAY, GeneratorUtil.generateNonNull(generator));
}