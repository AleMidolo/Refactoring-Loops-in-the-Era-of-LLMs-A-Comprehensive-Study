for (int i = 0; i < 10; i++) {
    String name = GeneratorUtil.generateNonNull(deGen);
    assertTrue(deNames.contains(name));
}