IntStream.rangeClosed(minLength, maxLength)
    .mapToObj(i -> new UniqueFixedLengthStringGenerator(chars, i, false))
    .forEach(subGens::add);