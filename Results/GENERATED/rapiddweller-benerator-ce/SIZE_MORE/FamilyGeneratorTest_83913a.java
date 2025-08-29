IntStream.range(0, 1).forEach(i -> {
    w = g.generate(w);
    FamilyContainer c = w.unwrap();
    assertNotNull(c.getFamilyPersonList());
    assertFalse(c.getFamilyPersonList().isEmpty());
    assertEquals(2, c.getParentCount());
    assertNotNull(c.getParents());
    c.getParents().forEach(parent -> {
        assertNotNull(parent);
        assertNotNull(parent.getFamilyName());
        assertNotNull(parent.getGivenName());
        assertNotNull(parent.getFamilyRole());
    });
    assertEquals(4, c.getGrandparentCount());
    assertNotNull(c.getGrandparents());
    c.getGrandparents().forEach(grandparent -> {
        assertNotNull(grandparent);
        assertNotNull(grandparent.getFamilyName());
        assertNotNull(grandparent.getGivenName());
        assertNotNull(grandparent.getFamilyRole());
    });
    assertTrue(c.getChildrenCount() >= 0);
    assertNotNull(c.getChildren());
    c.getChildren().forEach(child -> {
        assertNotNull(child);
        assertNotNull(child.getFamilyName());
        assertNotNull(child.getGivenName());
        assertNotNull(child.getFamilyRole());
    });
    long familyID = c.getFamilyPersonList().get(0).getFamilyID();
    assertTrue(familyID > 0);
    int fatherCount = c.getNumberOfRoleInFamily(FamilyRole.FATHER);
    assertEquals(1, fatherCount);
    int motherCount = c.getNumberOfRoleInFamily(FamilyRole.MOTHER);
    assertEquals(1, motherCount);
    int grandfatherCount = c.getNumberOfRoleInFamily(FamilyRole.GRANDFATHER);
    assertEquals(2, grandfatherCount);
    int grandmotherCount = c.getNumberOfRoleInFamily(FamilyRole.GRANDMOTHER);
    assertEquals(2, grandmotherCount);
});