IntStream.range(0, 1000)
         .mapToObj(i -> generator.generate())
         .peek(Objects::requireNonNull)
         .peek(day -> assertFalse(day.before(min)))
         .peek(day -> assertFalse(day.after(max)))
         .map(GregorianCalendar::new)
         .forEach(calendar -> {
             assertEquals(0, calendar.get(Calendar.MILLISECOND));
             assertEquals(0, calendar.get(Calendar.SECOND));
             assertEquals(0, calendar.get(Calendar.MINUTE));
             assertEquals(0, calendar.get(Calendar.HOUR));
         });