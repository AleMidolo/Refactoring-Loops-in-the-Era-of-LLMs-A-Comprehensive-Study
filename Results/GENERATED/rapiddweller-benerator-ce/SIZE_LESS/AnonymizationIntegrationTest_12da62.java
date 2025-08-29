out.getEntities("person").stream()
        .forEach(person -> assertEquals("***ce", person.get("name")));