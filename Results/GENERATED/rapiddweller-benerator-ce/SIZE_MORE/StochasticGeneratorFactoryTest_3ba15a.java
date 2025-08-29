IntStream.range(0, 1000)
    .mapToObj(i -> generator.generate(wrapper).unwrap())
    .mapToDouble(T::doubleValue)
    .forEach(n -> {
        assertTrue(n >= min.doubleValue());
        assertTrue(n <= max.doubleValue());
        int index = (int) ((n - min.doubleValue()) / granularity.doubleValue());
        count[index]++;
    });