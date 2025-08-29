for (Entity product : products) {
    assertNotNull(product);
    assertEquals(index, product.get("id"));
    index++;
}