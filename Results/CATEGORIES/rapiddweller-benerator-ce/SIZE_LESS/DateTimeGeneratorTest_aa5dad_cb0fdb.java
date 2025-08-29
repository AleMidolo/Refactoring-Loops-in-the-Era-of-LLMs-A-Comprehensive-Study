for (int i = 0; i < N; i++) {
    Date date = generator.generate();
    assertFalse("Generated date (" + date + ") is before minDate (" + minDate + ")", date.before(minDate));
    assertFalse(date.after(maxResult));
    Calendar cal = new GregorianCalendar();
    cal.setTime(date);
}