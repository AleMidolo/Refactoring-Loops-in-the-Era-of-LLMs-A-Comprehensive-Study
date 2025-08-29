expectedValues.forEach(expectedValue -> {
    Object actualValue = iterator.next(new DataContainer<>()).getData();
    assertEquals(expectedValue, actualValue);
});