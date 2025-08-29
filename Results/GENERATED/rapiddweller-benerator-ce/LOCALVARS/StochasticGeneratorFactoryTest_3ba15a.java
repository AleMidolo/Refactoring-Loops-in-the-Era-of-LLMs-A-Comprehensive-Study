IntStream.range(0, 1000)
    .mapToObj(i -> generator.generate(wrapper).unwrap())
    .mapToDouble(Number::doubleValue)
    .filter(d -> d >= min.doubleValue() && d <= max.doubleValue())
    .mapToInt(d -> (int) ((d - min.doubleValue()) / granularity.doubleValue()))
    .forEach(index -> count[index]++);