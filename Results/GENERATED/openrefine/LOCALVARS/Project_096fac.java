IntStream.range(0, count)
    .mapToObj(i -> reader.readLine())
    .filter(Objects::nonNull)
    .map(line -> Row.load(line, pool))
    .peek(project.rows::add)
    .map(row -> row.cells.size())
    .forEach(size -> maxCellCount = Math.max(maxCellCount, size));