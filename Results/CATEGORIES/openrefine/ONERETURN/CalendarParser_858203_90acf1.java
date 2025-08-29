for (int i = 0; i < MONTHS.length; i++) {
    if (lstr.startsWith(MONTHS[i][0]) || MONTHS[i][1].toLowerCase().startsWith(lstr)) {
        return i + 1;
    }
}