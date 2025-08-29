IntStream.range(0, 20)
    .mapToObj(i -> generateNonNull(generator))
    .forEach(System.out::println);