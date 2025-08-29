project.rows.stream()
    .forEach(row -> _removedColumns.stream()
        .forEach(column -> {
            int cellIndex = column.getCellIndex();
            Cell oldCell = null;
            if (cellIndex < row.cells.size()) {
                oldCell = row.cells.get(cellIndex);
            }
            _oldCells[count++] = new CellAtRowCellIndex(i, cellIndex, oldCell);
        })
    );