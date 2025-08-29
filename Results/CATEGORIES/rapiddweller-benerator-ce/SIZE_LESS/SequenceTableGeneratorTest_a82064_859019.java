for (int i = 0; i < 100; i++) {
    assertEquals(1000 + i, generator.generate().intValue());
}