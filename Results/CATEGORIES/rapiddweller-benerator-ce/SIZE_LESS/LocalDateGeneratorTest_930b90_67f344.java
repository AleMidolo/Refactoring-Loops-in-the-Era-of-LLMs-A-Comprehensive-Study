for (int i = 0; i < 1000; i++) {
    LocalDate date = g.generate();
    assertFalse(date.isBefore(min));
    assertFalse(date.isAfter(max));
    assertEquals(DayOfWeek.THURSDAY, date.getDayOfWeek());
}