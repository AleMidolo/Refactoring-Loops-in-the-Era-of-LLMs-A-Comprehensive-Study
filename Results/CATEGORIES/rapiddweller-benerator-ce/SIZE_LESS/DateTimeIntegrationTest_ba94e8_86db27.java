for (Object[] product : products) {
    Date date = (Date) product[0];
    assertFalse(date.after(MAX_DATE));
    usedDates.add(date);
}