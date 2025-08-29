for (int i = 0; i < 10; i++) {
    String actual = GeneratorUtil.generateNonNull(helper);
    assertEquals("Invalid product: ", "Alice", actual);
}