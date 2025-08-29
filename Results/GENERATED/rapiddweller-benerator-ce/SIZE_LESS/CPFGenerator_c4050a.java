int sum = IntStream.range(0, digits.size())
    .map(i -> digits.get(i) * (digits.size() + 1 - i))
    .sum();