IntStream.range(0, cells.size())
    .forEach(i -> {
        CellAtRow errorCell = cells.get(i);
        int rowId = errorCell.row;
        Cell oldCell = _project.rows.get(rowId).getCell(resultsCellIndex);
        cellChanges[i] = new CellChange(rowId, resultsCellIndex, oldCell, errorCell.cell);
    });