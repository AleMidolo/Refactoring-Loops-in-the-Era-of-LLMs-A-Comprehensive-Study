for (FamilyPerson parent : c.getParents()) {
    assertNotNull(parent);
    assertNotNull(parent.getFamilyName());
    assertNotNull(parent.getGivenName());
    assertNotNull(parent.getFamilyRole());
}