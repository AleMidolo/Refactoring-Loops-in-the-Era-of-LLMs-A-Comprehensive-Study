out.getEntities("person").stream()
    .forEach(person -> assertEquals("xxx", person.get("name")));