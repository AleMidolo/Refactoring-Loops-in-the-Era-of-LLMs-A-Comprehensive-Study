for (int c = 0; c < counts.length && c < s.length(); c++) {
    char ch = s.charAt(c);
    if (ch == ' ') {
        counts[c]++;
    }
}