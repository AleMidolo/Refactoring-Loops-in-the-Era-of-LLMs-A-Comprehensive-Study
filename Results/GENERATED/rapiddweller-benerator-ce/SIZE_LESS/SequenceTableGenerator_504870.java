IntStream.range(0, params.length)
    .forEach(i -> statement.setObject(2 + i, params[i]));