tList.stream()
        .forEach(token -> {
            if (DEBUG) {
                System.err.println("HOUR " + (state.isHourSet() ? Integer.toString(state.getHour()) : "UNSET") + ", MINUTE " + (state.isMinuteSet() ? Integer.toString(state.getMinute()) : "UNSET") + ", SECOND " + (state.isSecondSet() ? Integer.toString(state.getSecond()) : "UNSET") + ", MILLISECOND " + (state.isMillisecondSet() ? Integer.toString(state.getMillisecond()) : "UNSET") + ", TOKEN=\"" + token + "\"");
            }
            final int val;
            try {
                val = Integer.parseInt(token);
            } catch (NumberFormatException nfe) {
                throw new CalendarParserException("Bad " + getTimePlaceString(place) + " string \"" + token + "\" in \"" + dateStr + "\"");
            }
            switch(place) {
                case PLACE_HOUR:
                    try {
                        state.setHour(val);
                    } catch (CalendarParserException dfe) {
                        throw new CalendarParserException(dfe.getMessage() + " in \"" + dateStr + "\"");
                    }
                    if (DEBUG) {
                        System.err.println("Set hour to " + val);
                    }
                    place = PLACE_MINUTE;
                    break;
                case PLACE_MINUTE:
                    try {
                        state.setMinute(val);
                    } catch (CalendarParserException dfe) {
                        throw new CalendarParserException(dfe.getMessage() + " in \"" + dateStr + "\"");
                    }
                    if (DEBUG) {
                        System.err.println("Set minute to " + val);
                    }
                    place = PLACE_SECOND;
                    break;
                case PLACE_SECOND:
                    try {
                        state.setSecond(val);
                    } catch (CalendarParserException dfe) {
                        throw new CalendarParserException(dfe.getMessage() + " in \"" + dateStr + "\"");
                    }
                    if (DEBUG) {
                        System.err.println("Set second to " + val);
                    }
                    place = PLACE_MILLI;
                    break;
                case PLACE_MILLI:
                    try {
                        state.setMillisecond(val);
                    } catch (CalendarParserException dfe) {
                        throw new CalendarParserException(dfe.getMessage() + " in \"" + dateStr + "\"");
                    }
                    if (DEBUG) {
                        System.err.println("Set millisecond to " + val);
                    }
                    place = PLACE_UNKNOWN;
                    break;
                default:
                    throw new CalendarParserException("Unexpected place value " + place);
            }
        });