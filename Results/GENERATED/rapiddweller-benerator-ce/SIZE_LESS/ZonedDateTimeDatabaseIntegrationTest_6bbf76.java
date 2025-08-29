timestamps.stream()
    .map(Entity::get)
    .map(map -> map.get("zdt"))
    .forEach(zdt -> assertTrue(zdt instanceof ZonedDateTime));