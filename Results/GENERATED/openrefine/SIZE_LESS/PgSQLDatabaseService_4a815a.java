IntStream.rangeClosed(1, columnCount)
    .mapToObj(i -> queryResult.getString(i))
    .forEach(values::add);