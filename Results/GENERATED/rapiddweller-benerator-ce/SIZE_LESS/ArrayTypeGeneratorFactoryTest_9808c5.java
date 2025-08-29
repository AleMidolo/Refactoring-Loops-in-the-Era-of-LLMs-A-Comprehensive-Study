IntStream.range(0, expected.length)
    .forEach(i -> assertEquals(failureMessage, expected[i], actual[i]));