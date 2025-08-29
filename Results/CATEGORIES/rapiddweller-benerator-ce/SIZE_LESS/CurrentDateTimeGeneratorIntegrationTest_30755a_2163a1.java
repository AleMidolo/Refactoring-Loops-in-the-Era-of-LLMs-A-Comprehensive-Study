for (int i = 0; i < 3; i++) {
    assertEquals(ZoneId.of("America/Chicago"), ((ZonedDateTime) events.get(i).getComponent("dateTime")).getZone());
}