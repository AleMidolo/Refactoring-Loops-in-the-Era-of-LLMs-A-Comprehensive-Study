for (int i = 0; i < 5; i++) {
    String id = generator.generate();
    assertEquals(32, id.length());
}