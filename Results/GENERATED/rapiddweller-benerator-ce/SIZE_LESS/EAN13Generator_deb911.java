int sum = IntStream.range(0, 12)
    .map(i -> (chars[i] - '0') * (1 + (i % 2) * 2))
    .sum();