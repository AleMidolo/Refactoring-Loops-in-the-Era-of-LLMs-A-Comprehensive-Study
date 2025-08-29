IntStream.range(0, length)
    .forEach(i -> Array.set(attribute, i, applyToValue(Array.get(attribute, i)));