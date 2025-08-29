IntStream.range(0, 5)
    .mapToObj(i -> generateNonNull(phoneGenerator))
    .forEach(System.out::println);