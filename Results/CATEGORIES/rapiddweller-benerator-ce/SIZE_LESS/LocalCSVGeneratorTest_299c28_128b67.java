for (int i = 0; i < 10; i++) {
    String name = GeneratorUtil.generateNonNull(enGen);
    assertTrue(enNames.contains(name));
}