for (int i = 0; i < 34; i++) {
    Date date = generator.generate();
    assertNotNull("Generator unavailable after " + i + " generations", date);
    assertFalse("Generated date " + date + " is before min date: " + minDate, date.before(minDate));
    assertFalse(date.after(maxDate));
    Calendar cal = new GregorianCalendar();
    cal.setTime(date);
    assertEquals(hour, cal.get(Calendar.HOUR));
    assertEquals(minute, cal.get(Calendar.MINUTE));
    assertEquals(second, cal.get(Calendar.SECOND));
    assertEquals(millisecond, cal.get(Calendar.MILLISECOND));
}