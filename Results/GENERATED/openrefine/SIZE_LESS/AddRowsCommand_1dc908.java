data.stream()
    .map(rowStr -> Row.load(rowStr, pool))
    .filter(row -> !Objects.equals(row.toString(), "{}"))
    .forEach(rows::add);