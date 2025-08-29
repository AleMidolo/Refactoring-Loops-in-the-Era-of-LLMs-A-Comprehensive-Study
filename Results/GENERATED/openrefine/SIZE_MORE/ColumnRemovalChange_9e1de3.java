_oldCells = IntStream.range(0, _oldCells.length)
        .mapToObj(i -> {
            Row row = project.rows.get(i);
            Cell oldCell = cellIndex < row.cells.size() ? row.cells.get(cellIndex) : null;
            return new CellAtRow(i, oldCell);
        })
        .peek(row -> row.setCell(cellIndex, null))
        .toArray(CellAtRow[]::new);