for (int i = 0; i < 10; i++) {
    T object = GeneratorUtil.generateNonNull(generator);
    logger.debug(object.toString());
    assertTrue("Invalid object: " + object, validator.valid(object));
}