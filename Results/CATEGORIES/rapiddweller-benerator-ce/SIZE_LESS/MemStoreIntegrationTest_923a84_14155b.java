for (Entity order : products) {
    assertNotNull(order);
    assertEquals(index, order.get("id"));
    index++;
}