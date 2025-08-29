entities.stream()
        .forEach(entity -> assertEquals(JSONGenerator.SAMPLE, entity.getComponent(COLUMN_NAME)));