for (String file : products) {
    assertFalse(file.endsWith(".java"));
    assertFalse(file.endsWith(".html"));
}