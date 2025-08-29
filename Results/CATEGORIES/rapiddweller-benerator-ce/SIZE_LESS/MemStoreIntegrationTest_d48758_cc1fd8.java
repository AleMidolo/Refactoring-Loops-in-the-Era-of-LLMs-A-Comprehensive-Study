for (Entity order : orders) {
    assertNotNull(order);
    assertEquals(index, order.get("id"));
    int product = (Integer) order.get("product_id");
    assertTrue(product >= 3 && product < 5);
    index++;
}