IntStream.range(0, N)
    .mapToObj(i -> generator.generate())
    .peek(date -> assertFalse("Generated date (" + date + ") is before minDate (" + minDate + ")", date.before(minDate)))
    .peek(date -> assertFalse(date.after(maxResult)))
    .map(date -> {
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        return cal;
    })
    .forEach(cal -> {});