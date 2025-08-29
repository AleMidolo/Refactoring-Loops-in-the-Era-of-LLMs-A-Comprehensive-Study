IntStream.range(0, _fieldLengths.length)
    .forEach(i -> {
        int to = Math.min(end, from + _fieldLengths[i]);
        values[i] = s.substring(from, to);
        from = to;
    });