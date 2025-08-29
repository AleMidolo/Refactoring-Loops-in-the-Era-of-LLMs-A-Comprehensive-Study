_removedColumns.stream()
    .map(removedColumn -> {
        int cellIndex = removedColumn.getCellIndex();
        Row row = project.rows.get(i);
        Cell oldCell = (cellIndex < row.cells.size()) ? row.cells.get(cellIndex) : null;
        return new CellAtRowCellIndex(i, cellIndex, oldCell);
    }).forEach(cell -> _oldCells[count++] = cell);