_oldCells = IntStream.range(0, _oldCells.length)
    .mapToObj(i -> {
        Row row = project.rows.get(i);
        Cell oldCell = null;
        if (cellIndex < row.cells.size()) {
            oldCell = row.cells.get(cellIndex);
        }
        row.setCell(cellIndex, null);
        return new CellAtRow(i, oldCell);
    })
    .toArray(CellAtRow[]::new);