c.getChildren().stream()
    .forEach(child -> {
        assertNotNull(child);
        assertNotNull(child.getFamilyName());
        assertNotNull(child.getGivenName());
        assertNotNull(child.getFamilyRole());
    });