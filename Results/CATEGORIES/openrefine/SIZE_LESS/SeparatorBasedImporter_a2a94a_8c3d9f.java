for (String s : strings) {
    s = CharMatcher.whitespace().trimFrom(s);
    if (!s.isEmpty()) {
        retrievedColumnNames.add(s);
    }
}