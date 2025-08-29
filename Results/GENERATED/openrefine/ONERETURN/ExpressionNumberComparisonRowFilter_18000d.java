return IntStream.range(0, l)
    .anyMatch(i -> checkValue(JsonValueConverter.convert(a.get(i))));