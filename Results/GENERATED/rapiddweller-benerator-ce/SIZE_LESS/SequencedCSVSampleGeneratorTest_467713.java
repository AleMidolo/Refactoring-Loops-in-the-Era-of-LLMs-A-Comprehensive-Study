IntStream.range(0, 200000)
    .map(i -> i % 100)
    .forEach(writer::println);