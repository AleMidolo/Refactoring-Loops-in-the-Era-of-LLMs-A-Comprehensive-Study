for (int i = 0; i < 1000; i++) {
    Person person = generator.generate();
    int age = person.getAge();
    assertTrue("Person is expected to be at least 18 years old, but is " + age + ", " + "birthDate=" + person.getBirthDate(), age >= 18);
    assertTrue("Person is expected to be at most 21 years old, but is " + age + ", " + "birthDate=" + person.getBirthDate(), age <= 21);
    agesUsed.add(age);
    logger.debug(person.toString());
}