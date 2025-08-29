for (Object[] product : products) {
    Date date = (Date) product[0];
    assertFalse(date.before(MIN_DATE));
    usedDates.add(date);
}