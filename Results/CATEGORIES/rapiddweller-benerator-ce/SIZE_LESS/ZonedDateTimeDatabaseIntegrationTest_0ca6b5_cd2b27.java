for (Entity timestamp : timestamps) {
    assertTrue(timestamp.get("zdt") instanceof ZonedDateTime);
}