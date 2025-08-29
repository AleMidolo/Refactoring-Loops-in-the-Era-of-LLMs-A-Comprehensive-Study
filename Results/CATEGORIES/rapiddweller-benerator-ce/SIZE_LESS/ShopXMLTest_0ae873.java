for (int i = 0; i < 10; i++) {
    Entity entity = GeneratorUtil.generateNonNull(generator);
    if (entity != null) {
        logger.debug(entity.toString());
        assertTrue("Invalid entity: " + entity, validator.valid(entity));
    }
}