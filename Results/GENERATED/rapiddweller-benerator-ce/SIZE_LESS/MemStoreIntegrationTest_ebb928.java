orders.stream()
    .forEach(order -> {
        assertNotNull(order);
        assertEquals(index, order.get("id"));
        Entity product = (Entity) order.get("product");
        assertEquals(index + 2, product.get("id"));
        index++;
    });