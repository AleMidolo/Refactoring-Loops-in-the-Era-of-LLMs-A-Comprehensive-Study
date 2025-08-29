for (Entity person : out.getEntities("person")) {
    assertEquals("***ce", person.get("name"));
}