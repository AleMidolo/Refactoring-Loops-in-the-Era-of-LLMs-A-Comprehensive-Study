IntStream.range(0, count)
    .mapToObj(i -> reader.readLine())
    .takeWhile(Objects::nonNull)
    .map(line -> Row.load(line, pool))
    .peek(project.rows::add)
    .mapToInt(row -> row.cells.size())
    .max()
    .ifPresent(maxCellCount::Math.max);