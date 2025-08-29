for (end = start; end < source.length(); end++) {
    char c = source.charAt(end);
    if (!Character.isDigit(c)) {
        break;
    }
}