tList.stream()
    .forEach(token -> {
        if (DEBUG) {
            System.err.println("TZ_HOUR " + (hour != UNSET ? Integer.toString(hour) : "UNSET") + ", TZ_MINUTE " + (minute != UNSET ? Integer.toString(minute) : "UNSET") + ", TOKEN=\"" + token + "\"");
        }
        final int val;
        try {
            val = Integer.parseInt(token);
        } catch (NumberFormatException nfe) {
            throw new CalendarParserException("Bad time zone " + getTimePlaceString(place) + " offset \"" + token + "\" in \"" + dateStr + "\"");
        }
        switch(place) {
            case PLACE_HOUR:
                hour = val;
                if (DEBUG) {
                    System.err.println("Set time zone offset hour to " + val);
                }
                place = PLACE_MINUTE;
                break;
            case PLACE_MINUTE:
                minute = val;
                if (DEBUG) {
                    System.err.println("Set time zone offset minute to " + val);
                }
                place = PLACE_UNKNOWN;
                break;
            default:
                throw new CalendarParserException("Unexpected place value " + place);
        }
    });