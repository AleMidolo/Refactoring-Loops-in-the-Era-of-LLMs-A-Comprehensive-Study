IntStream.range(0, componentKeyValuePairs.length)
    .filter(i -> i % 2 == 0)
    .forEach(i -> setComponent((String) componentKeyValuePairs[i], componentKeyValuePairs[i + 1]));