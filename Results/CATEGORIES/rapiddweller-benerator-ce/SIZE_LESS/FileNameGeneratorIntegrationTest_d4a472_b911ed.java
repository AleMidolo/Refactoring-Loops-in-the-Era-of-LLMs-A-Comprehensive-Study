for (Entity file : files) {
    System.out.println(file);
    String path = (String) file.get("path");
    assertNotNull(path);
    assertFalse(path.contains("/"));
    assertFalse(path.contains("\\"));
}