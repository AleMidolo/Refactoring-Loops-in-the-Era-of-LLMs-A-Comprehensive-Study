for (Entity file : files) {
    System.out.println(file);
    String path = (String) file.get("path");
    assertNotNull(path);
    assertTrue(path.contains("src/main/java") || path.contains("src\\main\\java"));
    assertTrue(path.contains("/") || path.contains("\\"));
}