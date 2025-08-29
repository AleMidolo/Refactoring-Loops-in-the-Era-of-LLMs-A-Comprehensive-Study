IntStream.range(0, s.length() - size + 1)
    .mapToObj(i -> s.substring(i, i + size))
    .forEach(set::add);