data.stream()
    .map(rowStr -> Row.load(rowStr, pool))
    .filter(row -> !Objects.equals(row.toString(), "{}"))
    .findFirst()
    .ifPresent(row -> { throw new IllegalArgumentException("Row is not empty"); });