for (int i = 0; i < products.size(); i++) {
    Object p = products.get(i);
    assertEquals((1 + (i % 2)), p);
}