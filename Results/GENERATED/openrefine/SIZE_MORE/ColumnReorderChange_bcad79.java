_removedColumns.stream()
    .map(column -> {
        int cellIndex = column.getCellIndex();
        Row row = project.rows.get(i);
        Cell oldCell = null;
        if (cellIndex < row.cells.size()) {
            oldCell = row.cells.get(cellIndex);
        }
        return new CellAtRowCellIndex(i, cellIndex, oldCell);
    })
    .forEach(cell -> _oldCells[count++] = cell);