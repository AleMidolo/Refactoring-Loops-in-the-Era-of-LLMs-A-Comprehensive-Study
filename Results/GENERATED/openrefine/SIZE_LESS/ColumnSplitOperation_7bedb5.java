Arrays.stream(_fieldLengths)
    .mapToObj(length -> {
        int from = lastIndex;
        int to = Math.min(from + length, s.length());
        lastIndex = to;
        return stringToValue(s.substring(from, to));
    })
    .forEach(results::add);