for (int i = 0; i < 5; i++) {
    assertEquals(11 + i * 2, statement.generateDuration(context));
}