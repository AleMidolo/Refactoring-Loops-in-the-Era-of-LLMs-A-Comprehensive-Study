zoneNames.stream()
        .filter(zoneName -> token.equalsIgnoreCase(zoneName))
        .map(TimeZone::getTimeZone)
        .filter(tz -> tz.getRawOffset() != 0 || lToken.equals("gmt"))
        .forEach(state::setTimeZone);