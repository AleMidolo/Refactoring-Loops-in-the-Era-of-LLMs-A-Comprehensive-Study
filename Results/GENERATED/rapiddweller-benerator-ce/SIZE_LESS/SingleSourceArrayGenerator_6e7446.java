IntStream.range(0, size)
    .mapToObj(i -> generateFromSource())
    .takeWhile(Objects::nonNull)
    .forEach(component -> Array.set(array, i, component.unwrap());