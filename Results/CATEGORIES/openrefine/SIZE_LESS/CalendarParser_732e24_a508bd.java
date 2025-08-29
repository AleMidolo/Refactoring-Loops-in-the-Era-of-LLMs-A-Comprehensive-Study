for (String element : WEEKDAY_NAMES) {
    if (lstr.startsWith(element) || element.toLowerCase().startsWith(lstr)) {
        return true;
    }
}