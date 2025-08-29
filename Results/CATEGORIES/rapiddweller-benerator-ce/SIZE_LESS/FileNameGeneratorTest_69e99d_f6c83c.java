for (String file : products) {
    assertTrue(file, file.endsWith("com"));
    assertNotEquals("com", file);
}