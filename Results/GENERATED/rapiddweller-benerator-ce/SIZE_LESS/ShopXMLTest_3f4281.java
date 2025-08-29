IntStream.range(0, 10)
        .mapToObj(i -> GeneratorUtil.generateNonNull(generator))
        .peek(object -> logger.debug(object.toString()))
        .forEach(object -> assertTrue("Invalid object: " + object, validator.valid(object)));