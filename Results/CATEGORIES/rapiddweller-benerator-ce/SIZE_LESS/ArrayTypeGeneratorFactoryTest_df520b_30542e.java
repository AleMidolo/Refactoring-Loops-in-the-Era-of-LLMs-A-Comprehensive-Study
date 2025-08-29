for (int i = 0; i < 10; i++) {
    Object[] product = GeneratorUtil.generateNonNull(generator);
    assertNotNull(product);
    assertTrue("Expected 'Alice' or 'Bob', but was: " + product[0], "Alice".equals(product[0]) || "Bob".equals(product[0]));
    assertTrue((Integer) product[1] == 23 || (Integer) product[1] == 34);
}