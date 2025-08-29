IntStream.range(0, n)
    .mapToObj(i -> generator.generate(wrapper).unwrap())
    .forEach(result::add);