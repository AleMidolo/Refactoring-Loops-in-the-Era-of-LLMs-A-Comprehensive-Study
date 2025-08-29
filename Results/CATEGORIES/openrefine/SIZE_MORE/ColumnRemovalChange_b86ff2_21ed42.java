for (int i = 0; i < _oldCells.length; i++) {
    Row row = project.rows.get(i);
    Cell oldCell = null;
    if (cellIndex < row.cells.size()) {
        oldCell = row.cells.get(cellIndex);
    }
    _oldCells[i] = new CellAtRow(i, oldCell);
    row.setCell(cellIndex, null);
}