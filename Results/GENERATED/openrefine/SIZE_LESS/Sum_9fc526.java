IntStream.range(0, length)
        .mapToObj(i -> a[length - i - 1])
        .filter(n -> n instanceof Number)
        .mapToDouble(n -> ((Number) n).doubleValue())
        .forEach(total::add);