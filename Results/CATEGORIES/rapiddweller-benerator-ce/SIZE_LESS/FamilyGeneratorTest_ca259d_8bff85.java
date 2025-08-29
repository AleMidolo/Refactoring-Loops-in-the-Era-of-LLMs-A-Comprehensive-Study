for (FamilyPerson child : c.getChildren()) {
    assertNotNull(child);
    assertNotNull(child.getFamilyName());
    assertNotNull(child.getGivenName());
    assertNotNull(child.getFamilyRole());
}