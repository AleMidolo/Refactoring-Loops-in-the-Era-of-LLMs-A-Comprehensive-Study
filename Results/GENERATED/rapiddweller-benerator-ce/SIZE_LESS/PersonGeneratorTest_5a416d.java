IntStream.range(0, 10)
    .mapToObj(i -> generator.generate())
    .forEach(person -> logger.debug(person.toString()));