IntStream.range(0, 7).forEach(i -> {
    int javaDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
    boolean expectedResult;
    switch(javaDayOfWeek) {
        case Calendar.MONDAY:
            expectedResult = monday;
            break;
        case Calendar.TUESDAY:
            expectedResult = tuesday;
            break;
        case Calendar.WEDNESDAY:
            expectedResult = wednesday;
            break;
        case Calendar.THURSDAY:
            expectedResult = thursday;
            break;
        case Calendar.FRIDAY:
            expectedResult = friday;
            break;
        case Calendar.SATURDAY:
            expectedResult = saturday;
            break;
        case Calendar.SUNDAY:
            expectedResult = sunday;
            break;
        default:
            throw BeneratorExceptionFactory.getInstance().internalError("Not a supported day of week: " + javaDayOfWeek, null);
    }
    assertEquals("Check failed for " + cal, expectedResult, validator.valid(cal.getTime()));
    cal.add(Calendar.DATE, 1);
});