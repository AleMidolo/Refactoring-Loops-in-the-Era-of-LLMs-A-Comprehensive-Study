c.getGrandparents().stream()
    .forEach(grandparent -> {
        assertNotNull(grandparent);
        assertNotNull(grandparent.getFamilyName());
        assertNotNull(grandparent.getGivenName());
        assertNotNull(grandparent.getFamilyRole());
    });