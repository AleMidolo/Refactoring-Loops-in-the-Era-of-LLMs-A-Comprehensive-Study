for (FamilyPerson grandparent : c.getGrandparents()) {
    assertNotNull(grandparent);
    assertNotNull(grandparent.getFamilyName());
    assertNotNull(grandparent.getGivenName());
    assertNotNull(grandparent.getFamilyRole());
}