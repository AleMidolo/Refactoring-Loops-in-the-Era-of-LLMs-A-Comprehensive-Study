IntStream.rangeClosed(1, columnCount)
    .mapToObj(queryResult::getString)
    .forEach(values::add);