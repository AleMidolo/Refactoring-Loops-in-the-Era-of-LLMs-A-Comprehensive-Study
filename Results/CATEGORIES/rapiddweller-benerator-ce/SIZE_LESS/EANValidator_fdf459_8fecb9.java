for (int i = 0; i < number.length(); i++) {
    char c = number.charAt(i);
    if (!Character.isDigit(c)) {
        return false;
    }
    sum += (c - '0') * (1 + (i % 2) * 2);
}