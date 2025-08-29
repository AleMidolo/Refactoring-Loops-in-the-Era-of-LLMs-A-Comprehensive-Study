IntStream.range(0, array.length)
    .mapToObj(i -> convertAny(array[i], targetType))
    .forEach(value -> Array.set(result, i, value));