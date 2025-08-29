IntStream.range(0, columnNames.length)
    .forEach(i -> {
        Serializable rawCell = rawRow[i];
        row.setCell(i, (rawCell == null || rawCell instanceof Cell) ? (Cell) rawCell : new Cell(rawCell, null));
    });