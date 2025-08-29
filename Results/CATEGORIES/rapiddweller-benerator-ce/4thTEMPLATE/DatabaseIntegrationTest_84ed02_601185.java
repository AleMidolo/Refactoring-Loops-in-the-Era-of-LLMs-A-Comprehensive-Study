for (Entity product : products) {
    int ref = (Integer) product.get("referee_id");
    assertTrue(ref == 2 || ref == 3);
}