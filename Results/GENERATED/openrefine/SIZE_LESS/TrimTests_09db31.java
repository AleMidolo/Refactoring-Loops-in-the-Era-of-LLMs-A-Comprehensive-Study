IntStream.range(0, WHITESPACE.length())
    .mapToObj(i -> WHITESPACE.substring(i, i + 1))
    .forEach(c -> Assert.assertEquals((String) (invoke("trim", c + "foo" + c)), "foo", "Trim for whitespace char: '" + c + "' at index " + WHITESPACE.indexOf(c) + " failed"));