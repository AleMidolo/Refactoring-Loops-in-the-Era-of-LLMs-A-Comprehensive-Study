return IntStream.range(0, l)
        .anyMatch(i -> testValue(JsonValueConverter.convert(a.get(i))));