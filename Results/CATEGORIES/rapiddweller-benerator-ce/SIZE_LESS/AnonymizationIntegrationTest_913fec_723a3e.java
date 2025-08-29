for (Entity person : out.getEntities("person")) {
    assertEquals("Alice", person.get("name"));
}