IntStream.iterate(0, i -> i < maxCount || maxCount <= 0, i -> i + 1)
        .mapToObj(i -> generator.generate(wrapper))
        .takeWhile(Objects::nonNull)
        .map(Wrapper::unwrap)
        .collect(Collectors.toList());