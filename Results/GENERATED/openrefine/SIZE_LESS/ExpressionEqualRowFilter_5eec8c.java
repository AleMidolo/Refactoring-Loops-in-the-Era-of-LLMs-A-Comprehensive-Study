return IntStream.range(0, l)
    .mapToObj(i -> JsonValueConverter.convert(a.get(i)))
    .anyMatch(this::testValue);