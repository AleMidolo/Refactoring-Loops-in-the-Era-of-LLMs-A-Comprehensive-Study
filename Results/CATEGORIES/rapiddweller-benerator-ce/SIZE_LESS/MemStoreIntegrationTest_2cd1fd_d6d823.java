for (Entity customer : customers) {
    assertNotNull(customer);
    assertEquals(index, customer.get("id"));
    index++;
}