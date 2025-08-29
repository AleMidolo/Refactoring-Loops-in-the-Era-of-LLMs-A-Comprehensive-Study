IntStream.range(0, 2)
    .forEach(j -> row.cells.add((i == 1 && j == 0) ? new Cell(null, null) : new Cell("row" + i + "cell" + j, null));