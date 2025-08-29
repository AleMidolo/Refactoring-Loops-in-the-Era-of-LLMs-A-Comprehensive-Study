IntStream.range(0, 34)
    .mapToObj(i -> generator.generate())
    .forEach(date -> {
        assertNotNull("Generator unavailable after " + i + " generations", date);
        assertFalse("Generated date " + date + " is before min date: " + minDate, date.before(minDate));
        assertFalse(date.after(maxDate));
    });