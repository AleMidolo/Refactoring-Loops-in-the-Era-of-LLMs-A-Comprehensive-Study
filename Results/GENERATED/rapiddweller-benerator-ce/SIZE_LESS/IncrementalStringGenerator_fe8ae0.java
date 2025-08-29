IntStream.rangeClosed(minLength, maxLength)
        .filter(i -> i % lengthGranularity == 0)
        .mapToObj(i -> new UniqueFixedLengthStringGenerator(chars, i, true))
        .forEach(builder::add);