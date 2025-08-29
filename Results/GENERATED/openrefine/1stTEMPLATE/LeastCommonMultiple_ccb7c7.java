return IntStream.rangeClosed(1, largerValue)
    .filter(i -> (largerValue * i) % smallerValue == 0)
    .map(i -> largerValue * i)
    .findFirst()
    .orElseThrow();