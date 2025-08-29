for (int i = 0; i < products.size(); i++) {
    assertEquals((1 + (i % 2)), products.get(i).intValue());
}