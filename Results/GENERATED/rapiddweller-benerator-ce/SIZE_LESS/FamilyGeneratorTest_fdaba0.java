c.getParents().stream()
    .forEach(parent -> {
        assertNotNull(parent);
        assertNotNull(parent.getFamilyName());
        assertNotNull(parent.getGivenName());
        assertNotNull(parent.getFamilyRole());
    });