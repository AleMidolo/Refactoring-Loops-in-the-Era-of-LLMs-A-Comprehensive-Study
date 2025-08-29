for (FamilyPerson child : children) {
    assertEquals(fatherFamilyName, child.getFamilyName());
    assertTrue(child.getAge() >= 1 && child.getAge() <= (Math.min(fatherAge, motherAge)) - 18);
}