customers.stream()
    .forEach(customer -> {
        assertNotNull(customer);
        assertEquals(index, customer.get("id"));
        index++;
    });