IntStream.iterate(0, i -> i < maxCount || maxCount <= 0, i -> i + 1)
    .mapToObj(i -> {
        wrapper = generator.generate(wrapper);
        return wrapper != null ? wrapper.unwrap() : null;
    })
    .takeWhile(Objects::nonNull)
    .collect(Collectors.toList());