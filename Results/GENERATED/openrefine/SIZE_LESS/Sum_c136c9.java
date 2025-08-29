total = IntStream.range(0, length)
    .map(i -> length - i - 1)
    .mapToObj(a::get)
    .filter(n -> n instanceof Number)
    .map(n -> (Number) n)
    .mapToDouble(Number::doubleValue)
    .sum();