IntFunction<JsonValue> converter = i -> JsonValueConverter.convert(a.get(start + i));
IntStream.range(0, a2.length).forEach(i -> a2[i] = converter.apply(i));