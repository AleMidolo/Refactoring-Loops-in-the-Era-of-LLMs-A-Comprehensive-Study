IntStream.range(0, 4)
    .mapToObj(i -> Integer.parseInt(sufix.substring(i, i + 1)))
    .forEach(digits::add);