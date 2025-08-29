for (int i = 0; i < 10; i++) {
    FamilyPerson firstFamilyPerson = generator.generate();
    firstFamilyPerson.setFamilyRole(FamilyRole.FATHER);
    FamilyPerson secondFamilyPerson = generator.generateFromEntityAndRelation(firstFamilyPerson, testConstraint);
    assertNotNull(firstFamilyPerson);
    assertNotNull(secondFamilyPerson);
    String firstFamilyName = firstFamilyPerson.getFamilyName();
    int firstAge = firstFamilyPerson.getAge();
    String secondFamilyName = secondFamilyPerson.getFamilyName();
    int secondAge = secondFamilyPerson.getAge();
    FamilyRole secondRole = secondFamilyPerson.getFamilyRole();
    assertNotNull(firstFamilyName);
    assertNotNull(secondFamilyName);
    assertTrue(firstAge > 0);
    assertTrue(secondAge > 0);
    assertNotNull(secondRole);
    assertEquals(firstFamilyName, secondFamilyName);
    assertEquals(FamilyRole.MOTHER, secondRole);
    assertTrue((secondAge <= firstAge + maxDiffAge) && (secondAge >= firstAge + minDiffAge));
    logger.debug("firstPerson: {}", firstFamilyPerson);
    logger.debug("secondPerson (related from the firstPerson): {}", secondFamilyPerson);
}