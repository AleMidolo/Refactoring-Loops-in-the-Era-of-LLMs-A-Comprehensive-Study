IntStream.range(0, count)
    .mapToObj(i -> reader.readLine())
    .takeWhile(Objects::nonNull)
    .map(line -> Row.load(line, pool))
    .peek(project.rows::add)
    .map(Row::getCells)
    .map(List::size)
    .forEach(cellsSize -> maxCellCount = Math.max(maxCellCount, cellsSize));