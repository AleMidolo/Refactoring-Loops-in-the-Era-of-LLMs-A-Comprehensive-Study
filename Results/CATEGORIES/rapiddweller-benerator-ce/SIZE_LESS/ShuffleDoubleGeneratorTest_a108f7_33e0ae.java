for (double expected : expectedProducts) {
    assertEquals(expected, generator.generate(), 0);
}