out.getEntities("person")
    .stream()
    .forEach(person -> assertEquals("Alice", person.get("name")));