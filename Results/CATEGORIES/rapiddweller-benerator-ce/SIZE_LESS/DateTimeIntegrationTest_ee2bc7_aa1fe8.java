for (Object[] product : products) {
    Date date = (Date) product[0];
    assertFalse(date.before(MIN_DATE));
    assertFalse(date.after(MAX_DATE));
    usedDates.add(date);
}