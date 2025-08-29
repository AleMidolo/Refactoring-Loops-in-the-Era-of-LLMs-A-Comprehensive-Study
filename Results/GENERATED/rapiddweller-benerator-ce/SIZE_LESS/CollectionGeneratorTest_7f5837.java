IntStream.range(0, 5000)
        .mapToObj(i -> GeneratorUtil.generateNonNull(generator))
        .map(List::size)
        .forEach(counter::count);