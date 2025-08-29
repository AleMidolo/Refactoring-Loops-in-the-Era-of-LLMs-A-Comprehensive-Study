int lastSubGenIndex = IntStream.range(0, statements.size())
    .map(i -> statements.size() - 1 - i)
    .filter(i -> statements.get(i) instanceof GenIterStatement)
    .findFirst()
    .orElse(-1);