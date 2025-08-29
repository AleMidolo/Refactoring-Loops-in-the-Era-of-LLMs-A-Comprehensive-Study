IntStream.range(0, 1000)
    .mapToObj(i -> generator.generate(wrapper).unwrap())
    .filter(c -> specialChars.indexOf(c) >= 0)
    .forEach(c -> specialCount[specialChars.indexOf(c)]++);