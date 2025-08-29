project.rows.stream()
    .flatMap(row -> IntStream.range(0, _removedColumns.size())
        .mapToObj(j -> {
            int cellIndex = _removedColumns.get(j).getCellIndex();
            Cell oldCell = cellIndex < row.cells.size() ? row.cells.get(cellIndex) : null;
            return new CellAtRowCellIndex(project.rows.indexOf(row), cellIndex, oldCell);
        }))
    .forEach(cell -> _oldCells[count++] = cell);