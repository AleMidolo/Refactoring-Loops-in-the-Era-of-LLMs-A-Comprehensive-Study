IntStream.range(124, 190)
    .mapToObj(i -> "Q" + String.valueOf(i))
    .forEach(ids::add);