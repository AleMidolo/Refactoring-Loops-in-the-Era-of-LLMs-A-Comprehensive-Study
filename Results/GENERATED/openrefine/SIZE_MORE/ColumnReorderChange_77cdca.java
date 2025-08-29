project.rows.parallelStream().forEach(row ->
    _removedColumns.stream()
        .map(removedColumn -> {
            int cellIndex = removedColumn.getCellIndex();
            Cell oldCell = null;
            if (cellIndex < row.cells.size()) {
                oldCell = row.cells.get(cellIndex);
            }
            return new CellAtRowCellIndex(i, cellIndex, oldCell);
        })
        .forEach(cell -> _oldCells[count++] = cell)
);