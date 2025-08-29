for (int i = 0; i < _fieldLengths.length; i++) {
    int to = Math.min(end, from + _fieldLengths[i]);
    values[i] = s.substring(from, to);
    from = to;
}