project.rows.stream()
    .forEach(row -> {
        IntStream.range(0, _removedColumns.size())
            .forEach(j -> {
                int cellIndex = _removedColumns.get(j).getCellIndex();
                Cell oldCell = cellIndex < row.cells.size() ? row.cells.get(cellIndex) : null;
                _oldCells[count++] = new CellAtRowCellIndex(project.rows.indexOf(row), cellIndex, oldCell);
            });
    });