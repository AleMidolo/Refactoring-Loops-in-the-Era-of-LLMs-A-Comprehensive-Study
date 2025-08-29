for (int i = 0; i < tmp.length(); i++) {
    char c = tmp.charAt(i);
    if (c >= '0' && c <= '9') {
        digits.append(c);
    } else if (c >= 'A' && c <= 'Z') {
        int n = c - 'A' + 10;
        digits.append((char) ('0' + n / 10));
        digits.append((char) ('0' + (n % 10)));
    } else {
        return -1;
    }
}