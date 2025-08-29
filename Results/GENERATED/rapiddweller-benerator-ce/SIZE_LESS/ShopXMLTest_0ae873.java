IntStream.range(0, 10)
        .mapToObj(i -> GeneratorUtil.generateNonNull(generator))
        .filter(Objects::nonNull)
        .peek(entity -> logger.debug(entity.toString()))
        .forEach(entity -> assertTrue("Invalid entity: " + entity, validator.valid(entity)));