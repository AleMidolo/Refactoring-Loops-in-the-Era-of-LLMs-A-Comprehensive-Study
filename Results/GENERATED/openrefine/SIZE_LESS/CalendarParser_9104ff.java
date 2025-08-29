return Arrays.stream(WEEKDAY_NAMES)
        .anyMatch(element -> lstr.startsWith(element) || element.toLowerCase().startsWith(lstr));