for (int i = 0; i < 1000; i++) {
    ZonedDateTime dateTime = g.generate();
    LocalDate date = dateTime.toLocalDate();
    assertFalse(date.isBefore(minDate));
    assertFalse(date.isAfter(maxDate));
    assertEquals(DayOfWeek.THURSDAY, dateTime.getDayOfWeek());
    LocalTime time = dateTime.toLocalTime();
    assertFalse(time.isBefore(minTime));
    assertFalse(time.isAfter(maxTime));
    assertEquals(0, time.getMinute() % 5);
    assertEquals(zone, dateTime.getZone());
}