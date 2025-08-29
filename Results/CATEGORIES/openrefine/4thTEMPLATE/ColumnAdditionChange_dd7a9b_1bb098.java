for (CellAtRow cell : _newCells) {
    Row row = project.rows.get(cell.row);
    row.setCell(_newCellIndex, null);
}