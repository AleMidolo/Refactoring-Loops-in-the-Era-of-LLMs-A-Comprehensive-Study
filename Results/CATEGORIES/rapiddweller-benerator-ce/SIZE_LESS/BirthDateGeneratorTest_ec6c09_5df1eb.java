for (int i = 0; i < 1000; i++) {
    Date birthDate = generator.generate();
    int age = TimeUtil.yearsBetween(birthDate, now);
    assertTrue("Generated birth date is too new: " + birthDate, age >= 3);
    assertTrue("Generated birth date is too old: " + birthDate, age <= 12);
}