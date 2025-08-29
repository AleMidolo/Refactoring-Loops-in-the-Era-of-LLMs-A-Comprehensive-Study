files.stream()
    .peek(System.out::println)
    .map(file -> (String) file.get("path"))
    .forEach(path -> {
        assertNotNull(path);
        assertFalse(path.contains("/"));
        assertFalse(path.contains("\\"));
    });