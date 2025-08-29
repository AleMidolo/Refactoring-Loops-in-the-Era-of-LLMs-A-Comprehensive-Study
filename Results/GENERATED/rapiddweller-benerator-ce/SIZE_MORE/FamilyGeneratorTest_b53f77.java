IntStream.range(0, 1000).forEach(i -> {
    w = g.generate(w);
    FamilyContainer c = w.unwrap();
    FamilyPerson father = c.getFamilyPersonList().stream().filter(familyPerson -> familyPerson.getFamilyRole().equals(FamilyRole.FATHER)).findFirst().orElse(null);
    assertNotNull(father);
    int fatherAge = father.getAge();
    String fatherFamilyName = father.getFamilyName();
    FamilyPerson mother = c.getFamilyPersonList().stream().filter(familyPerson -> familyPerson.getFamilyRole().equals(FamilyRole.MOTHER)).findFirst().orElse(null);
    assertNotNull(mother);
    int motherAge = mother.getAge();
    String motherFamilyName = mother.getFamilyName();
    FamilyPerson grandParentOfFather = c.getGrandparents().stream().filter(grandparent -> grandparent.getRelations().containsKey(father)).findFirst().orElse(null);
    assertNotNull(grandParentOfFather);
    int grandParent1Age = grandParentOfFather.getAge();
    String grandParent1FamilyName = grandParentOfFather.getFamilyName();
    List<FamilyPerson> children = c.getChildren();
    assertNotNull(children);
    int childrenCount = children.size();
    assertTrue(c.getFamilyPersonList().get(0).getAge() >= customFirstParentMinAgeYears && c.getFamilyPersonList().get(0).getAge() <= customFirstParentMaxAgeYears);
    assertEquals(fatherFamilyName, motherFamilyName);
    assertTrue(c.getFamilyPersonList().get(1).getAge() >= c.getFamilyPersonList().get(0).getAge() + customMinDiffAgeInPeerRelation && c.getFamilyPersonList().get(1).getAge() <= c.getFamilyPersonList().get(0).getAge() + customMaxDiffAgeInPeerRelation);
    assertEquals(fatherFamilyName, grandParent1FamilyName);
    assertTrue(grandParent1Age >= fatherAge + customMinDiffAgeInHigherRelation && grandParent1Age <= fatherAge + customMaxDiffAgeInHigherRelation);
    assertTrue(childrenCount <= customMaxBiologicalChildrenNumber + customMaxChildrenAdoptedNumber);
    children.forEach(child -> {
        assertEquals(fatherFamilyName, child.getFamilyName());
        assertTrue(child.getAge() >= 1 && child.getAge() <= (Math.min(fatherAge, motherAge)) - 18);
    });
});