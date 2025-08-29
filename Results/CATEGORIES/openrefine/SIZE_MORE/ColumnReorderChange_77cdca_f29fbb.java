for (int i = 0; i < project.rows.size(); i++) {
    for (int j = 0; j < _removedColumns.size(); j++) {
        int cellIndex = _removedColumns.get(j).getCellIndex();
        Row row = project.rows.get(i);
        Cell oldCell = null;
        if (cellIndex < row.cells.size()) {
            oldCell = row.cells.get(cellIndex);
        }
        _oldCells[count++] = new CellAtRowCellIndex(i, cellIndex, oldCell);
    }
}