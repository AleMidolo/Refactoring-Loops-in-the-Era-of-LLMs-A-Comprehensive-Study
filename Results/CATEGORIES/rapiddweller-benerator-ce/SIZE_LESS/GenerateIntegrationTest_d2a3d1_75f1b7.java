for (int i = 0; i < 3; i++) {
    assertNull(((Entity) consumer.getProducts().get(0)).get("att"));
}