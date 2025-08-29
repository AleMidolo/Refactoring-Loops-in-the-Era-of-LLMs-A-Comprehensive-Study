for (int i = 0; i < 1000; i++) {
    Person person = generator.generate();
    if (person.getGender() == Gender.FEMALE) {
        femCount++;
    }
    logger.debug(person.toString());
}