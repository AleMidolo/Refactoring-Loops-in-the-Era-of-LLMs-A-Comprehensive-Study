products.stream()
        .forEach(file -> {
            assertFalse(file.endsWith(".java"));
            assertFalse(file.endsWith(".html"));
        });