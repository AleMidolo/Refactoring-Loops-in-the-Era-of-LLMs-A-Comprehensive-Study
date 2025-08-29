IntStream.range(0, 3)
    .forEach(i -> assertEquals(ZoneId.of("America/Chicago"), ((ZonedDateTime) events.get(i).getComponent("dateTime")).getZone()));