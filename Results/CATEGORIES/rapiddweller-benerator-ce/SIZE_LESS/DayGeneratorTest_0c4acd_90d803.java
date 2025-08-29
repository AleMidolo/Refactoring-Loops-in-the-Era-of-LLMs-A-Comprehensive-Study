for (int i = 0; i < 1000; i++) {
    Date day = generator.generate();
    assertNotNull(day);
    assertEquals(day, min);
}