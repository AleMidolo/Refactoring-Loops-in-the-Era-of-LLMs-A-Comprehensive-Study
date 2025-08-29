for (Entity order : orders) {
    assertNotNull(order);
    assertEquals(index, order.get("id"));
    Entity product = (Entity) order.get("product");
    assertEquals(index + 2, product.get("id"));
    index++;
}