BeneratorErrorIds.class.getFields()
            .stream()
            .forEach(field -> {
                assertModifier(Modifier.PUBLIC, field);
                assertModifier(Modifier.STATIC, field);
                assertModifier(Modifier.FINAL, field);
                Object value = field.get(null);
                assertTrue(value instanceof String);
                String id = (String) value;
                assertTrue("Id does not match regex " + regex + ": " + id, RegexUtil.matches(regex, id));
                assertFalse("Duplicate ErrorId: " + id, usedIds.contains(id));
                usedIds.add(id);
            });