expectedValues.stream()
    .map(expectedValue -> iterator.next(new DataContainer<>()).getData())
    .forEach(actualValue -> assertEquals(expectedValue, actualValue));