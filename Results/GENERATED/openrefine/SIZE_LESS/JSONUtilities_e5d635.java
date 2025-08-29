IntStream.range(0, v.size())
    .forEach(i -> result[i] = JsonValueConverter.convertComparable(v.get(i)));