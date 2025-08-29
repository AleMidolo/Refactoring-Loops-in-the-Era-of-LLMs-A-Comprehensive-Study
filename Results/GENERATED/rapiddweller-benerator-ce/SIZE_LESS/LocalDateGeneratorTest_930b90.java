IntStream.range(0, 1000)
    .mapToObj(i -> g.generate())
    .forEach(date -> {
        assertFalse(date.isBefore(min));
        assertFalse(date.isAfter(max));
        assertEquals(DayOfWeek.THURSDAY, date.getDayOfWeek());
    });