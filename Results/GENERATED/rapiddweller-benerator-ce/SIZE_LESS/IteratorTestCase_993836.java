expectedValues.stream()
    .forEach(expected -> assertNext(expected, iterator));