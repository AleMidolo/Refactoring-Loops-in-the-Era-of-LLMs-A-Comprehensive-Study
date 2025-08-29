int sum = IntStream.range(0, 8)
        .map(i -> (chars[i] - '0') * (1 + (i % 2) * 2))
        .sum();