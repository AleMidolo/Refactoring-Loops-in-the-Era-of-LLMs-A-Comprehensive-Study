for (int i = 0; i < 3; i++) {
    assertEquals(2 + 2 * i, ((Entity) products.get(i)).get("id"));
}