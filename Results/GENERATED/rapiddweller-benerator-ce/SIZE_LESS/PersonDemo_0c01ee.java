IntStream.range(0, 100)
    .mapToObj(i -> generateNonNull(generator))
    .forEach(System.out::println);