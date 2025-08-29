IntStream.range(0, 7).forEach(i -> {
    int javaDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
    boolean expectedResult = switch (javaDayOfWeek) {
        case Calendar.MONDAY -> monday;
        case Calendar.TUESDAY -> tuesday;
        case Calendar.WEDNESDAY -> wednesday;
        case Calendar.THURSDAY -> thursday;
        case Calendar.FRIDAY -> friday;
        case Calendar.SATURDAY -> saturday;
        case Calendar.SUNDAY -> sunday;
        default -> throw BeneratorExceptionFactory.getInstance().internalError("Not a supported day of week: " + javaDayOfWeek, null);
    };
    assertEquals("Check failed for " + cal, expectedResult, validator.valid(cal.getTime()));
    cal.add(Calendar.DATE, 1);
});