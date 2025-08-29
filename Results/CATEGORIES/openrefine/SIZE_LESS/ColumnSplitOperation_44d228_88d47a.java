for (int length : _fieldLengths) {
    int from = lastIndex;
    int to = Math.min(from + length, s.length());
    results.add(stringToValue(s.substring(from, to)));
    lastIndex = to;
}