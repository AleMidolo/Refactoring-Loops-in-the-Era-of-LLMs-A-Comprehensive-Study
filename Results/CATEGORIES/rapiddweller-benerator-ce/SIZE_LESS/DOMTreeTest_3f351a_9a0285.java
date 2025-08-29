for (T expectedValue : expectedValues) {
    Object actualValue = iterator.next(new DataContainer<>()).getData();
    assertEquals(expectedValue, actualValue);
}