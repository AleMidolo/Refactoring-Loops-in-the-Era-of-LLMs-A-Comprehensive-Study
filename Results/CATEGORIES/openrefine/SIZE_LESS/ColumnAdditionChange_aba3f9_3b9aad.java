for (CellAtRow cell : _newCells) {
    project.rows.get(cell.row).setCell(_newCellIndex, cell.cell);
}