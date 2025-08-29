IntStream.range(0, 10)
    .mapToObj(i -> generateNonNull(generator))
    .forEach(System.out::println);