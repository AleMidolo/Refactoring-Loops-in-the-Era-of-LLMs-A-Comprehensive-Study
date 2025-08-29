return Arrays.stream(a)
        .map(v -> v instanceof String ? (String) v : v.toString())
        .anyMatch(v -> checkValue(v) != invert);