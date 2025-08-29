for (int i = 0; i < 10; i++) {
    FamilyPerson familyPerson = generator.generate();
    assertNotNull(familyPerson);
    logger.debug(familyPerson.toString());
}