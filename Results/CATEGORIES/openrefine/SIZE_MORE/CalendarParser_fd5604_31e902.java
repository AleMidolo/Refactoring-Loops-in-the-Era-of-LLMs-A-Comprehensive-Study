for (String zoneName : zoneNames) {
    if (token.equalsIgnoreCase(zoneName)) {
        TimeZone tz = TimeZone.getTimeZone(token);
        if (tz.getRawOffset() != 0 || lToken.equals("gmt")) {
            state.setTimeZone(tz);
            return;
        }
    }
}