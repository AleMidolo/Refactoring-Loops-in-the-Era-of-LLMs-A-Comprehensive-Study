for (Entity person : out.getEntities("person")) {
    assertEquals("xxx", person.get("name"));
}