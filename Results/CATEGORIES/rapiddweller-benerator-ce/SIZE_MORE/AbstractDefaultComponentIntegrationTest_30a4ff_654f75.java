for (Entity product : products) {
    String createdBy = (String) product.get("created_by");
    assertEquals("Bob", createdBy);
    Object created_at = product.get("created_at");
    if (created_at instanceof String) {
        created_at = DATE_TIME_FORMAT.parse((String) created_at);
    }
    Date creationDate = (Date) created_at;
    assertNotNull(creationDate);
    long productMillis = creationDate.getTime();
    assertTrue(Math.abs(productMillis - currentMillies) < 3000);
}