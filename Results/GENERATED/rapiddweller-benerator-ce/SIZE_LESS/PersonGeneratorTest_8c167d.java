IntStream.range(0, 1000)
    .mapToObj(i -> generator.generate())
    .peek(person -> logger.debug(person.toString()))
    .filter(person -> person.getGender() == Gender.FEMALE)
    .count();