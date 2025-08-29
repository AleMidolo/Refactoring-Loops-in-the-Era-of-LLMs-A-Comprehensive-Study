products.stream()
    .forEach(order -> {
        assertNotNull(order);
        assertEquals(index, order.get("id"));
        index++;
    });