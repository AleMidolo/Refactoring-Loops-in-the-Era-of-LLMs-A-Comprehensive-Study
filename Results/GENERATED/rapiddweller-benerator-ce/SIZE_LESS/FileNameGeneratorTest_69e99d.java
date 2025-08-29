products.stream()
        .forEach(file -> {
            assertTrue(file.endsWith("com"));
            assertNotEquals("com", file);
        });  