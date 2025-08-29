for (int i = 0; i < 1000; i++) {
    Date day = generator.generate();
    assertNotNull(day);
    assertFalse(day.before(min));
    assertFalse(day.after(max));
    GregorianCalendar calendar = new GregorianCalendar();
    calendar.setTime(day);
    assertEquals(0, calendar.get(Calendar.MILLISECOND));
    assertEquals(0, calendar.get(Calendar.SECOND));
    assertEquals(0, calendar.get(Calendar.MINUTE));
    assertEquals(0, calendar.get(Calendar.HOUR));
}