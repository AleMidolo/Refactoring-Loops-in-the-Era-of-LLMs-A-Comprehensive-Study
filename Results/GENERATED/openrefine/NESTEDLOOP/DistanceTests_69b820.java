IntStream.range(0, testString.length)
    .forEach(i -> IntStream.range(i + 1, testString.length)
            .forEach(j -> Assert.assertEquals(testString[i].length() - testString[j].length(),
                    _distance.compute(testString[i], testString[j]),
                    "User defined distance for strings: " + testString[i] + ", " + testString[j] + " failed"));