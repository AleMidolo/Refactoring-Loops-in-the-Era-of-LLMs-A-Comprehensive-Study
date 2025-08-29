for (int i = 0; i < 10; i++) {
    Person person = generator.generateForDataset("DE");
    assertNotNull(person);
    logger.debug(person.toString());
}