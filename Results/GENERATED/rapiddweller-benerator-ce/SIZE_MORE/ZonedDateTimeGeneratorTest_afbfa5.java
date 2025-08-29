IntSummaryStatistics stats = IntStream.range(0, 1000)
    .mapToObj(i -> g.generate())
    .map(ZonedDateTime::toLocalDate)
    .peek(date -> assertFalse(date.isBefore(minDate)))
    .peek(date -> assertFalse(date.isAfter(maxDate)))
    .map(ZonedDateTime::getDayOfWeek)
    .forEach(dayOfWeek -> assertEquals(DayOfWeek.THURSDAY, dayOfWeek));

IntStream.range(0, 1000)
    .mapToObj(i -> g.generate().toLocalTime())
    .peek(time -> assertFalse(time.isBefore(minTime)))
    .peek(time -> assertFalse(time.isAfter(maxTime)))
    .forEach(time -> {
        assertEquals(0, time.getMinute() % 5);
        assertEquals(zone, ZonedDateTime.of(LocalDate.now(), time, zone).getZone());
    });