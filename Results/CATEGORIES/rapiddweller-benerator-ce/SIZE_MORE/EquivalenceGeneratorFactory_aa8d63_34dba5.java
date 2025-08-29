for (char c : characters) {
    if (Character.isUpperCase(c)) {
        uppers.add(c);
    } else if (Character.isLowerCase(c)) {
        lowers.add(c);
    } else if (Character.isDigit(c)) {
        digits.add(c);
    } else if (Character.isWhitespace(c)) {
        spaces.add(c);
    } else {
        others.add(c);
    }
}